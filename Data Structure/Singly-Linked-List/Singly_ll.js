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
    pop() {
        if (!this.length)
            return undefined;
        let temp = this.head;
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
            this.length--;
            return temp;

        } else {
            let prev = this.head;
            while (temp.next) {
                prev = temp;
                temp = temp.next;
            }
            this.tail = prev;
            this.tail.next = null;
            this.length--;
            return temp;
        }
    }
    unshift(data) {
        const newNode = new Node(data);
        if (!this.length) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
        return this;
    }
    shift() {
        if (!this.length)
            return undefined;
        let temp = this.head;
        if (this.length == 1) {
            this.head = null;
            this.tail = null;
        }
        else {
            this.head = this.head.next;
            temp.next = null;
        }
        this.length--;
        return temp;
    }
}
const sll = new SinglyLinkedList(10);
console.log("Push Operation");
sll.push(20);
sll.push(30);
console.log(sll);

console.log("Pop Operation");
sll.pop();
console.log(sll);

console.log("Unshift Opeartion");
sll.unshift(100);
sll.unshift(200);
console.log(sll);

console.log("Shift Opeartion");
sll.shift();
sll.shift();
console.log(sll);
