#ifdef WIN32
#else
  #include <jni_interface.h>
#endif // WIN32


unsigned char* to_unsigned_char_array(JNIEnv *env, jbyteArray array) {
	int len = env->GetArrayLength(array);
	unsigned char* buf = new unsigned char[len];
	env->GetByteArrayRegion(array, 0, len, reinterpret_cast<jbyte*>(buf));
	return buf;
}

template<class T>
int length(T& arr)
{
    return sizeof(arr) / sizeof(arr[0]);
}

JNIEXPORT jbyteArray JNICALL Java_com_fty_utils_RtcmUtil_passStructToJava
  (JNIEnv *e, jclass clz) {

    slogd("passStructToJava: ======= begin ======");

    ST_USER st_usr;

    rtcm::User usr;

    rtcm::Card * card = usr.mutable_card();
    card->set_id(st_usr.card->id);
    card->set_cash(st_usr.card->cash);
    card->set_sign(st_usr.card->sign);
    card->set_foo(st_usr.card->foo);

    usr.set_name(st_usr.name);
    usr.set_age(st_usr.age);
    usr.set_hascar(st_usr.hasCar);
    for (int i = 0; i < length(st_usr.likeNums); i++) {
        usr.add_likenums(st_usr.likeNums[i]);
    }


    std::string s("");
    usr.SerializeToString(&s);

    int length = s.size();
    slogd("passStructToJava: byte length: %d", length);


    jbyteArray arr = e->NewByteArray(length);
    e->SetByteArrayRegion(arr, 0, length, (jbyte*)s.data());
    return arr;

    e->DeleteLocalRef(arr);
}

JNIEXPORT jint JNICALL Java_com_fty_utils_RtcmUtil_passObjToNative
  (JNIEnv *e, jclass clz, jbyteArray jArr, jint len) {

    slogd("passObjToNative: len: %d", len);

    rtcm::User usr;
    usr.ParseFromArray(to_unsigned_char_array(e, jArr), len);

    const rtcm::Card card = usr.card();

    slogd("passObjToNative: values: id:%d, cash:%.2f, sign:%s, foo:%.1f, name: %s, age:%d, car:%d, nums:%d",
        card.id(), card.cash(), card.sign().c_str(), card.foo(),
        usr.name().c_str(), usr.age(), usr.hascar(), usr.likenums(0));

    return 1;
}