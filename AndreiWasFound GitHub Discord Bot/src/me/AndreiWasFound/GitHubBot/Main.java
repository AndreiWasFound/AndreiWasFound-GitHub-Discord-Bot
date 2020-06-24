package me.AndreiWasFound.GitHubBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {
	public static JDA jda;
	public static String prefix = "!!";
	
	// Main method
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws LoginException{
		jda = new JDABuilder(AccountType.BOT).setToken("NzI1MzUwNTg3MjQzMTY3ODE3.XvNgLg.UlLDaMJbsAJ6PhnOtNFRqzmAtf4").build();
		jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
		jda.getPresence().setActivity(Activity.watching("on !!help"));
		
		jda.addEventListener(new Commands());
	}
}
