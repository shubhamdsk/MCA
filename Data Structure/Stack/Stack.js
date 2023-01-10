class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}
class stack {
    constructor(data) {
        const newNode = new Node(data);
        this.top = newNode;
        this.length = 1;
    }
}
const ns = new stack(10);
console.log(ns);
