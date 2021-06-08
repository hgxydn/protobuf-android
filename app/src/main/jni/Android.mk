LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := protobuf
LOCAL_SRC_FILES := $(LOCAL_PATH)/prebuild-libs/$(TARGET_ARCH_ABI)/libprotobuf.so
include $(PREBUILT_SHARED_LIBRARY)


include $(CLEAR_VARS)
LOCAL_MODULE := rtcm
LOCAL_SRC_FILES := rtcm.pb.cc \
  jni_interface.cpp
LOCAL_SHARED_LIBRARIES := protobuf

LOCAL_CFLAGS := -std=c++11 -fexceptions -frtti
LOCAL_LDLIBS := -llog -lz

include $(BUILD_SHARED_LIBRARY)