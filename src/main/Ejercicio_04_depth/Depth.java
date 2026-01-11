package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {
   public Depth() {
   }

   public int maxDepth(Node root) {
      if (root == null) {
         return 0;
      } else {
         int leftDepth = this.maxDepth(root.getLeft());
         int rightDepth = this.maxDepth(root.getRight());
         return Math.max(leftDepth, rightDepth) + 1;
      }
   }
}
