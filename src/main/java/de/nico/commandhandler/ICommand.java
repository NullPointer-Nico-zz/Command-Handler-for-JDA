package de.nico.commandhandler;

import net.dv8tion.jda.api.entities.Message;

public interface ICommand
{
    public void onCommand(Message msg);
}
