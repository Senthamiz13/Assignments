class person implements Comparable<person>{
    String name;
    int height;
    int weight;

    public person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(person i) {
        if(this.weight > i.weight){ return -1;}
        else if(this.weight < i.weight){ return 1;}
        else if(this.weight == i.weight){
            if(this.height > i.height){ return -1;}
            else if(this.height < i.height){ return 1;}
        }
        return 0;
    }
}


