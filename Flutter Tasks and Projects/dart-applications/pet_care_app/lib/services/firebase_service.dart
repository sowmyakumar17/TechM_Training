    import 'package:cloud_firestore/cloud_firestore.dart';

    Stream<QuerySnapshot> fetchCaretakers() {
    return FirebaseFirestore.instance.collection('caretakers').snapshots();
    }
