class CustomAppBar extends StatelessWidget implements PreferredSizeWidget {
  final String title;

  CustomAppBar({required this.title});

  @override
  Widget build(BuildContext context) {
    return AppBar(
      title: Text(title),
      backgroundColor: Colors.orange,
    );
  }

  @override
  Size get preferredSize => Size.fromHeight(kToolbarHeight);
}
