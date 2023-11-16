# Fifo in Pseudocode 
```` python
öffentlich Klasse Element
    current : Text
    next : Element
    next = null


    Element (Text s) 
    
        this.current = s

    Ende öffentlich Element
``````

```` python
Öffentlich Klasse Fifo 

    first: Element 
    first = null

    Text pop() 
        WENN first == null 
            Rückgabe null;
        ENDE WENN

        Text ret = first.current
        this.first = this.first.next
        Rückgabe ret
       

    push(String s) 
        WENN first == null 
            first = Neu Element(s)
        ENDE WENN 

        SONST 
            Element iterator = first

            SOlANGE (iterator.next != null) 
                iterator = iterator.next
            ENDE SOLANGE

        ENDE SONST

        iterator.next = new Element(s)

````

```` python
Öffentlich Klasse Main

    Operation main(String[] args)
    
        Fifo f = Neues Fifo()
        
        f.push("Hallo")
        f.push("a")
        f.push("KLSDK")

        FÜR(int i =0; i<3; i++)
            Ausgabe(f.pop())
        ENDE FÜR
    
    



````
