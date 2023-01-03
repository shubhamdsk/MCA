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
    push(value) {
        const newnode = new node(value);
        if (!this.length) {
            this.head = newnode;
            this.tail = newnode;
        } else {
            this.tail.next = newnode;
            newnode.pre = this.tail;
            this.tail = newnode;
        }
        this.length++;
        return this;
    }
}

const dl = new Doublylinkedlist(10);
console.log("Push Operation");
dl.push(20);
dl.push(30);
dl.push(40);
dl.push(50);
console.log(dl);