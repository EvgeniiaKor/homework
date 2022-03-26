package hw6.task1;

public class Groups {
    // название группы
    // идет ли набор
    // массив альпинистов
    // гора
    private String groupName;
    private boolean openGroup;
    private Alphinist[] alphinists;
    private Mountain mountain;

    public  Groups (boolean openGroup,Alphinist[] alphinists){
        setOpenGroup(openGroup);
        setMountain(mountain);
        setAlphinists(alphinists);
    }


    public String getGroupName(){return  groupName;}
    public Boolean getOpenGroup(){return  openGroup;}
    public Alphinist[] getAlphinists(){return alphinists;}
    public Mountain getMountain() {return mountain;}


    public  void setGroupName(String groupName){
        if (groupName == null || groupName.length()< 2){
            throw new IllegalArgumentException("groupName от 2 символов");
        }
        this.groupName = groupName;
    }

    public  void setOpenGroup(boolean openGroup){
        this.openGroup = openGroup;
    }

    public  void setAlphinists(Alphinist[] alphinists){
        if (alphinists.length == 0){
            throw new IllegalArgumentException("Должен быть хотя бы 1 элемент");
        }
        this.alphinists = alphinists;
    }

    public  void setMountain(Mountain mountain) {
        this.mountain = mountain;
    }

////
    public  void  addAlphinist(Alphinist alphinist){
        if (openGroup == false){
            System.out.println("мест нет");
        } else {
            for (int i = 0; i < alphinists.length; i++){
                if (alphinists[i] == null){
                    alphinists[i] = alphinist;
                    return;
                }
            }
            System.out.println("Набор в группу окончен");
            openGroup = false;
        }
    }

    public  void addAlpinists(Alphinist...alphinists){
        for(Alphinist alphinist: alphinists){
            addAlpinists(alphinists);
        }
    }
}