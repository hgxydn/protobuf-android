//#include<stdio.h>
//#include <math.h>
//#include <memory.h>

//#include <stdlib.h>
#include <string>
#include "rtcm.pb.h"
#include "com_fty_utils_RtcmUtil.h"
unsigned char* to_unsigned_char_array(JNIEnv *env, jbyteArray array);


#ifdef WIN32
#else

#if defined(__ANDROID__)
  #include <android/log.h>
  #ifndef LOG_TAG
    #define LOG_TAG "stone.stone"
    #define slogd(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
  #endif
#endif // __ANDROID__


#endif // WIN32

typedef struct ST_CARD
{
	int    id;
	double cash;
	char   sign[4];
	float  foo;
	ST_CARD() {
	    id = 62170226;
	    cash = 10000.0;
	    sign[0] = 'I';
	    sign[1] = 'C';
	    sign[2] = 'B';
	    sign[3] = 'C';
	    foo = 2.0;
	}
}CARD;

typedef struct ST_USER
{
	CARD * card;
	char name[8];
	int  age;
	bool hasCar;
	int  likeNums[4];

    ST_USER() {
        card = new ST_CARD();
        for (int i = 0; i < 8; i++) {
            name[i] = 'a' + i;
        }
        age = 30;
        hasCar = true;
        for (int i = 0; i < 4; i++) {
            likeNums[i] = 5 + i;
        }
    }

}USER;