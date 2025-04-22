class Tree:
    def __init__(self, data) :
        self.data = data
        self.children = []

    def add_child(self, child) :
        self.children.append(child)

    def remove_child(self, child):
        self.children.remove(child)

    def print_tree(self, level=0):
        print(" " * level * 4 + self.data)
        for child in self.children:
            child.print_tree(level + 1)


root =Tree("Kakek & nenek")
node_1 = Tree("Paman1")
node_2 = Tree("Paman2")
node_3 = Tree("Paman3")
node_4 = Tree("Ibu")
cucu1= Tree("Kakak")
cucu2 = Tree("Tia")

root.add_child(node_1)
root.add_child(node_2)
root.add_child(node_3)
root.add_child(node_4)
node_4.add_child(cucu1)
node_4.add_child(cucu2)

root.print_tree()