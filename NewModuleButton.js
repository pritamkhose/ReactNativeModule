/* eslint-disable react-native/no-inline-styles */
import React, {useState} from 'react';
import {NativeModules, View, Text, Button} from 'react-native';

const {ToastModule, ConstantModule} = NativeModules;

const NewModuleButton = () => {
  const [data, setData] = useState(0);
  function _showToast() {
    console.log('This is a native toast!');
    ToastModule.showToast('This is a native toast!!');
  }

  ConstantModule.getDate(res => {
    setData(res);
  });

  return (
    <>
      <Text>https://codersera.com/blog/react-native-bridge-for-android/</Text>
      <Text>https://reactnative.dev/docs/native-modules-android</Text>
      <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
        <Button onPress={_showToast} title="Toast Button" />
      </View>
      <Text>Battery Level = {ToastModule.getBatteryLevel()} % </Text>
      <Text>App Date = {JSON.stringify(data)}</Text>
      <Text>App Details = {JSON.stringify(ConstantModule.getConstants())}</Text>
    </>
  );
};

export default NewModuleButton;
