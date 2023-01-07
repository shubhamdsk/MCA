class node {
    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
} class bst {
    constructor() {
        this.root = null;
    }
    insert(data) {
        var newnode = new node(data);
        if (this.root == null) {
            this.root = newnode;
        } else {
            this.insertNode(this.root, newnode);
        }
    }
}