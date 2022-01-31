import 'package:flutter/material.dart';

class Contact extends StatelessWidget {
  final String address;
  final String call;
  const Contact({Key? key, required this.address, required this.call})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(12),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [
          Text(
            address,
            style: const TextStyle(fontSize: 16),
          ),
          Text(call, style: const TextStyle(fontSize: 16))
        ],
      ),
    );
  }
}
