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
    enqueue(data) {
        const newNode = new Node(data);
        if (!this.length) {
            this.front = newNode;
            this.rear = newNode;
            this.length = 1;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
        this.length++;
        return this;
    }
}
const q = new Queue(5);
console.log("Enqueue Operation");
q.enqueue(44);
q.enqueue(55);
console.log(q);