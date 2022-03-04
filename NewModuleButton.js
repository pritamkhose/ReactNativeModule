import React, {useState} from 'react';
import {Button, NativeModules, StyleSheet, Text, View} from 'react-native';

const {ToastModule, ConstantModule, ConsoleModule} = NativeModules;

const NewModuleButton = () => {
  const [data, setData] = useState(0);
  const [batteryPrecent, setBatteryPrecent] = useState(0);

  function _showToast() {
    console.log('This is a native toast!');
    ToastModule.showToast('This is a native toast!!');
  }

  function printlog() {
    console.log('This is a print console log');
    ConsoleModule.log('Log >> ', 'This is a print log!');
  }

  ConstantModule.getDate(res => {
    setData(res);
  });

  function getBatteryPrecent() {
    setBatteryPrecent(ToastModule.getBatteryLevel());
  }

  return (
    <>
      <Text>https://codersera.com/blog/react-native-bridge-for-android/</Text>
      <Text>https://reactnative.dev/docs/native-modules-android</Text>
      <View style={styles.container}>
        <Button onPress={_showToast} title="Toast Button" />
      </View>
      <Text>Battery Level = {batteryPrecent} % </Text>
      <View style={styles.container}>
        <Button onPress={getBatteryPrecent} title="Battery Precent" />
      </View>
      <Text>App Date = {JSON.stringify(data)}</Text>
      <Text>App Details = {JSON.stringify(ConstantModule.getConstants())}</Text>
      <View style={styles.container}>
        <Button onPress={printlog} title="Console Log" />
      </View>
    </>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 24,
    alignItems: 'center',
    justifyContent: 'center',
  },
});

export default NewModuleButton;
