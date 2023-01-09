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

    dequeue() {
        let temp = this.front;
        if (!this.length) {
            return undefined;
        }
        if (this.length == 1) {
            this.front = -1;
            this.rear = -1;
        } else {
            this.temp = this.front;
            this.temp.next = this.front;
            this.temp.next = null;

        }
        this.length--;
        return temp;
    }
}
const q = new Queue();
console.log("Enqueue Operation");
q.enqueue(44);
q.enqueue(55);
console.log(q);
console.log("Dequeue Operation");
q.dequeue();
console.log(q);