/**
 ArrayList
 The program will create an arraylist that uses
 Author: Ishan
 Collaborator(s):
 Collaboration:
 Date: 10/28/21
 **/
public class ArrayList <T> {
    private int size;
    private Node<T> oldNode;

    public NodeArrayList(){
        this.size = 0;
        this.oldNode = new Node<T>();
    }

//returns false if an error happens to be in the list
    public boolean add(T data){
        try {
            //Determine added node in chain
            Node new = oldNode;
            for (int i = 0; i < size; i++) {
                new = new.getChild();
            }
            //new node with the data
            Node<T> newNode = new Node<T>(data);
            newNode.setParent(curNode);
            size++;
        }
        catch(Exeption a) {
            // exeption occured
            e.printStackTrace();
            return false;
        }
        //No exeptions
        return true;
        }
    }

}
