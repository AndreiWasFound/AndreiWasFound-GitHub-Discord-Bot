package me.AndreiWasFound.GitHubBot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
				
		if (args[0].equalsIgnoreCase(Main.prefix + "info")) {
			
			EmbedBuilder info = new EmbedBuilder();
			info.setTitle("GitHub AndreiWasFound Information");
			info.setDescription("Information about this bot and AndreiWasFound's GitHub.");	
			info.addField("Link to AndreiWasFound's GitHub repositories is:", "https://github.com/AndreiWasFound?tab=repositories", true);
			info.setColor(0x1bf5e6);
			info.setFooter("Created by AndreiWasFound");
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
		}
		
		if (args[0].equalsIgnoreCase(Main.prefix + "help")) {
			
			EmbedBuilder help = new EmbedBuilder();
			help.setTitle("AndreiWasFound GitHub Bot Commands");
			help.setDescription("Prefix for this bot is: !!");	
			help.addField("To get info about this bot, type:", "!!info", true);
			help.setColor(0x1bf5e6);
			help.setFooter("Created by AndreiWasFound");
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(help.build()).queue();
			help.clear();
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(help.build()).queue();
			help.clear();
		}
	}

	
	
}
