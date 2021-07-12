/* eslint-disable prettier/prettier */
import React from 'react';
import {NativeModules, View, Text, Button} from 'react-native';

const {ToastModule} = NativeModules;

const NewModuleButton = () => {

  function _showToast() {
    console.log('This is a native toast!');
    ToastModule.showToast('This is a native toast!!');
  }

  return (
    <>
    <Text>https://codersera.com/blog/react-native-bridge-for-android/</Text>
    <Text>https://reactnative.dev/docs/native-modules-android</Text>
      <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
        <Button onPress={_showToast} title="Toast Button" />
      </View>
      <Text>Battery Levvel = {ToastModule.getBatteryLevel()} % </Text>
    </>
  );
};

export default NewModuleButton;
