class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}
class Queue {
    constructor(data) {
        const newNode = new Node(data);
        this.front = newNode;
        this.rear = this.front;
        this.length = 1;
    }
}
const q = new Queue(5);
console.log(q);