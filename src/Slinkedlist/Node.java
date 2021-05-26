/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slinkedlist;

/**
 *
 * @author UserPCC
 */
public class Node {
    protected int data;
    protected Node link;
    
    public Node()
    {
    link = null;
    data = 0;
    }
    
    
    public Node(int i, Node n)
    {
        data = i;
        link = n;
    }
    
    public void setLink(Node n)
    {
        link = n;
    }
    
    public void setData(int i)
    {
        data = i;
    }
    
    public Node getLink()
    {
        return link;
    }
    
    public int getData()
    {
        return data;
    }
}
