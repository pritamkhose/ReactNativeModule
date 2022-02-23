# ReactNativeModule
 React Native Moduele connect app android native java code with fastlane

# fastlane documentation
----

# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```sh
xcode-select --install
```

For _fastlane_ installation instructions, see [Installing _fastlane_](https://docs.fastlane.tools/#installing-fastlane)

# Available Actions

## iOS

### ios test

```sh
[bundle exec] fastlane ios test
```

Runs all the tests

### iOS release custom_lane

```sh
[bundle exec] fastlane custom_lane
```

Runs all the tests && Build Release

### android beta

```sh
[bundle exec] fastlane android beta
```

Submit a new Beta Build to Crashlytics Beta

### Android Product Flavour

```sh
yarn run install
mkdir android/app/src/main/assets
yarn run androidclean
yarn run bundle
yarn run androidapk
```

Runs all the tests && Build Release

### android deploy

```sh
[bundle exec] fastlane app deploy
```

Deploy a new version to the app store

----

This README.md is auto-generated and will be re-generated every time [_fastlane_](https://fastlane.tools) is run.

More information about _fastlane_ can be found on [fastlane.tools](https://fastlane.tools).

The documentation of _fastlane_ can be found on [docs.fastlane.tools](https://docs.fastlane.tools).

The documentation [Fastlane iOS Setup 1](https://docs.fastlane.tools/getting-started/ios/beta-deployment/#best-practices)

The documentation [Fastlane iOS Setup 2](https://thecodingmachine.github.io/react-native-boilerplate/docs/BetaBuild/).

The documentation [Fastlane iOS Setup 3](https://docs.fastlane.tools/getting-started/cross-platform/react-native/)

[Learn more about how to automatically generate localized App Store screenshots](https://docs.fastlane.tools/getting-started/ios/screenshots/)

[Learn more about distribution to beta testing services](https://docs.fastlane.tools/getting-started/ios/beta-deployment/)

[Learn more about how to automate the App Store release process:](https://docs.fastlane.tools/getting-started/ios/appstore-deployment/)

[Learn more about how to setup code signing with fastlane](https://docs.fastlane.tools/codesigning/getting-started/)

The documentation [Fastlane Android Setup](https://docs.fastlane.tools/getting-started/android/setup/).
