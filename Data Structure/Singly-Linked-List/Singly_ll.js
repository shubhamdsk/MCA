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
    
}
const sll = new SinglyLinkedList(10);
console.log(sll)