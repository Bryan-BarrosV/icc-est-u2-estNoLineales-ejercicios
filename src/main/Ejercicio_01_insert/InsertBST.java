package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {
   public InsertBST() {
   }

   public Node insert(Node root, int value) {
      if (root == null) {
         return new Node(value);
      } else {
         if (value < root.getValue()) {
            root.setLeft(this.insert(root.getLeft(), value));
         } else if (value > root.getValue()) {
            root.setRight(this.insert(root.getRight(), value));
         }

         return root;
      }
   }
}