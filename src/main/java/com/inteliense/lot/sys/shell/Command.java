package com.inteliense.lot.sys.shell;

public abstract class Command {

    public abstract Status lineRead(byte[] bytes, String string);

}
