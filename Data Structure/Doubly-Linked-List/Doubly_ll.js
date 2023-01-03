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
    pop() {
        if (!this.length)
            return undefined;
        let temp = this.tail;
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        } else {
            temp.pre.next = null;
            this.tail = temp.pre;
            temp.pre = null;
        }
        this.length--;
        return temp;
    }
    unshift(value) {
        const newNode = new node(value);
        if (!this.length) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
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
console.log("Pop Opration");
dl.pop();
dl.pop();
dl.pop();
console.log(dl);
console.log("Unshift Opration");
dl.unshift(100);
dl.unshift(200);
dl.unshift(300);
console.log(dl);