    import 'package:sqflite/sqflite.dart';
    import 'package:path/path.dart';

    void saveApplication(String name) async {
    final database = openDatabase(
        join(await getDatabasesPath(), 'applications.db'),
        onCreate: (db, version) {
        return db.execute('CREATE TABLE applications(id INTEGER PRIMARY KEY, name TEXT)');
        },
        version: 1,
    );
    final db = await database;
    await db.insert('applications', {'name': name});
    }
