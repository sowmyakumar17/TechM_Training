    class BottomNavBar extends StatelessWidget {
    final int currentIndex;
    final Function(int) onTap;

    BottomNavBar({required this.currentIndex, required this.onTap});

    @override
    Widget build(BuildContext context) {
        return BottomNavigationBar(
        currentIndex: currentIndex,
        onTap: onTap,
        selectedItemColor: Colors.orange,
        items: [
            BottomNavigationBarItem(icon: Icon(Icons.home), label: 'Home'),
            BottomNavigationBarItem(icon: Icon(Icons.pets), label: 'Pets'),
            BottomNavigationBarItem(icon: Icon(Icons.person), label: 'Profile'),
        ],
        );
    }
    }
