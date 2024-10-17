package structural.composite.B3;

import java.awt.*;

public class File extends AbstractFile {

    public File(String name, String createDate) {
        super(name, createDate);
    }

    @Override
    public String getPath() {
        return name;
    }

    @Override
    public String getTreeFolder(String prefix) {
        return prefix + name +"\n";
    }
}

