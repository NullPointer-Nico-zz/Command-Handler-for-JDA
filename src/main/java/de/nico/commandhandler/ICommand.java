package de.nico.commandhandler;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;

public interface ICommand
{
    public void onCommand(Message msg, MessageChannel channel, String[] args);
}
    