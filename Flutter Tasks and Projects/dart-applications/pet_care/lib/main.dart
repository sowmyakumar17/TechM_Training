import 'package:flutter/material.dart';
import 'package:firebase_core/firebase_core.dart';
import 'screens/auth_screen.dart';
import 'screens/home_screen.dart';
import 'screens/profile_screen.dart';
import 'screens/request_screen.dart';
import 'screens/splash_screen.dart';
import 'firebase_options.dart';
import 'components/custom_button.dart';
import 'components/custom_textfield.dart';
import 'components/pet_card.dart';
import 'widgets/app_bar.dart';
import 'widgets/bottom_nav_bar.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp(options: DefaultFirebaseOptions.currentPlatform);
  runApp(PetCareApp());
}

class PetCareApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Pet Care App',
      theme: ThemeData(
        primarySwatch: Colors.orange,
      ),
      home: SplashScreen(),
      routes: {
        '/auth': (ctx) => AuthScreen(),
        '/home': (ctx) => HomeScreen(),
        '/profile': (ctx) => ProfileScreen(),
        '/request': (ctx) => RequestScreen(),
      },
    );
  }
}
