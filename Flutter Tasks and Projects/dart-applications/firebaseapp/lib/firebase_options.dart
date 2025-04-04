// File generated by FlutterFire CLI.
// ignore_for_file: type=lint
import 'package:firebase_core/firebase_core.dart' show FirebaseOptions;
import 'package:flutter/foundation.dart'
    show defaultTargetPlatform, kIsWeb, TargetPlatform;

/// Default [FirebaseOptions] for use with your Firebase apps.
///
/// Example:
/// ```dart
/// import 'firebase_options.dart';
/// // ...
/// await Firebase.initializeApp(
///   options: DefaultFirebaseOptions.currentPlatform,
/// );
/// ```
class DefaultFirebaseOptions {
  static FirebaseOptions get currentPlatform {
    if (kIsWeb) {
      return web;
    }
    switch (defaultTargetPlatform) {
      case TargetPlatform.android:
        return android;
      case TargetPlatform.iOS:
        return ios;
      case TargetPlatform.macOS:
        return macos;
      case TargetPlatform.windows:
        return windows;
      case TargetPlatform.linux:
        throw UnsupportedError(
          'DefaultFirebaseOptions have not been configured for linux - '
          'you can reconfigure this by running the FlutterFire CLI again.',
        );
      default:
        throw UnsupportedError(
          'DefaultFirebaseOptions are not supported for this platform.',
        );
    }
  }

  static const FirebaseOptions web = FirebaseOptions(
    apiKey: 'AIzaSyD2vWaIGqOn4_516c1hU-hfLaGUHm-nOEI',
    appId: '1:733161196706:web:4a5f50494759886e8a5bfb',
    messagingSenderId: '733161196706',
    projectId: 'flutterbackend-9896f',
    authDomain: 'flutterbackend-9896f.firebaseapp.com',
    storageBucket: 'flutterbackend-9896f.firebasestorage.app',
    measurementId: 'G-S3DFPREXD0',
  );

  static const FirebaseOptions android = FirebaseOptions(
    apiKey: 'AIzaSyBT8CN0RbjBnSV27dZ7TsFqOmf-Ac3LmQo',
    appId: '1:733161196706:android:da216012bb4fda448a5bfb',
    messagingSenderId: '733161196706',
    projectId: 'flutterbackend-9896f',
    storageBucket: 'flutterbackend-9896f.firebasestorage.app',
  );

  static const FirebaseOptions ios = FirebaseOptions(
    apiKey: 'AIzaSyA9hMut0jkJI4wTdcY0kcj1_G-t3gTb9aU',
    appId: '1:733161196706:ios:0211f6e30b5ddeb78a5bfb',
    messagingSenderId: '733161196706',
    projectId: 'flutterbackend-9896f',
    storageBucket: 'flutterbackend-9896f.firebasestorage.app',
    iosBundleId: 'com.example.firebaseapp',
  );

  static const FirebaseOptions macos = FirebaseOptions(
    apiKey: 'AIzaSyA9hMut0jkJI4wTdcY0kcj1_G-t3gTb9aU',
    appId: '1:733161196706:ios:0211f6e30b5ddeb78a5bfb',
    messagingSenderId: '733161196706',
    projectId: 'flutterbackend-9896f',
    storageBucket: 'flutterbackend-9896f.firebasestorage.app',
    iosBundleId: 'com.example.firebaseapp',
  );

  static const FirebaseOptions windows = FirebaseOptions(
    apiKey: 'AIzaSyD2vWaIGqOn4_516c1hU-hfLaGUHm-nOEI',
    appId: '1:733161196706:web:84d6ceb8802bb9a88a5bfb',
    messagingSenderId: '733161196706',
    projectId: 'flutterbackend-9896f',
    authDomain: 'flutterbackend-9896f.firebaseapp.com',
    storageBucket: 'flutterbackend-9896f.firebasestorage.app',
    measurementId: 'G-7KQWW4PPLF',
  );

}