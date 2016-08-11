/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

import AlarmManager from './AlarmManager';

import Button from 'react-native-button';

class MyAlarm extends Component {
  render() {
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>
          Welcome to React Native!
        </Text>
        <Text style={styles.instructions}>
          To get started, edit index.android.js
        </Text>
        <View style={styles.instructions}>
          <Button
            style={{borderWidth: 1, borderColor: 'blue'}}
            onPress={this._handlePress}>
            Press Me!
          </Button>
        </View>
      </View>
    );
  }

  _handlePress(event) {
    AlarmManager.setAlarm(30);
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    marginBottom: 5,
  }
});

AppRegistry.registerComponent('MyAlarm', () => MyAlarm);
