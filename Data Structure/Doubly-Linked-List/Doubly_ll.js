class node {
    constructor(value) {
        this.value = value;
        this.pre = null;
        this.next = null;
    }
}
class Doublylinkedlist {
    constructor(value) {
        const newnode = new node(value);
        this.head = newnode;
        this.tail = newnode;
        this.length = 1;
    }
}
const dl = new Doublylinkedlist(10);
console.log(dl);