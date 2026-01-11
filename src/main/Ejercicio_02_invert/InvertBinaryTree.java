package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
   public InvertBinaryTree() {
   }

   public Node invertTree(Node root) {
      if (root == null) {
         return null;
      } else {
         Node left = this.invertTree(root.getLeft());
         Node right = this.invertTree(root.getRight());
         root.setLeft(right);
         root.setRight(left);
         return root;
      }
   }
}
