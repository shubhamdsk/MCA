class Node {
    constructor(data) {
        this.value = data,
            this.next = null
    }
}
class SinglyLinkedList {
    constructor(data) {
        const NewNode = new Node(data);
        this.head = NewNode;
        this.tail = NewNode;
        this.length = 1
    }
    push(data) {
        const newNode = new Node(data);
        if (!this.length) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
        return this;
    }
}
const sll = new SinglyLinkedList(10);
sll.push(20);
sll.push(30)
console.log(sll)