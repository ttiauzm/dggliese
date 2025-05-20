class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key

class BST:
    def __init__(self):
        self.root = None

    def insert(self, key):
        if self.root is None:
            self.root = Node(key)
        else:
            self._insert_rec(self.root, key)

    def _insert_rec(self, node, key):
        if key < node.val:
            if node.left is None:
                node.left = Node(key)
            else:
                self._insert_rec(node.left, key)
        else:
            if node.right is None:
                node.right = Node(key)
            else:
                self._insert_rec(node.right, key)

    def search(self, key):
        return self._search_rec(self.root, key)

    def _search_rec(self, node, key):
        if node is None or node.val == key:
            return node
        if key < node.val:
            return self._search_rec(node.left, key)
        return self._search_rec(node.right, key)

    def find_min(self):
        return self._find_min_rec(self.root)

    def _find_min_rec(self, node):
        current = node
        while current.left is not None:
            current = current.left
        return current.val

    def find_max(self):
        return self._find_max_rec(self.root)

    def _find_max_rec(self, node):
        current = node
        while current.right is not None:
            current = current.right
        return current.val

    def inorder(self):
        return self._inorder_rec(self.root)

    def _inorder_rec(self, node):
        return self._inorder_rec(node.left) + [node.val] + self._inorder_rec(node.right) if node else []

    def preorder(self):
        return self._preorder_rec(self.root)

    def _preorder_rec(self, node):
        return [node.val] + self._preorder_rec(node.left) + self._preorder_rec(node.right) if node else []

    def postorder(self):
        return self._postorder_rec(self.root)

    def _postorder_rec(self, node):
        return self._postorder_rec(node.left) + self._postorder_rec(node.right) + [node.val] if node else []

# Contoh penggunaan
if __name__ == "__main__":
    bst = BST()
    bst.insert(50)
    bst.insert(30)
    bst.insert(70)
    bst.insert(20)
    bst.insert(40)
    bst.insert(60)
    bst.insert(80)
    bst.insert(100)

    print("Inorder traversal:", bst.inorder())
    print("Preorder traversal:", bst.preorder())
    print("Postorder traversal:", bst.postorder())
    print("Minimum value:", bst.find_min())
    print("Maximum value:", bst.find_max())

    search_value = 10
    found_node = bst.search(search_value)
    if found_node:
        print(f"Value {search_value} found in BST.")
    else:
        print(f"Value {search_value} not found in BST.")
