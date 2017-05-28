package elexa.main;

import org.bukkit.plugin.java.JavaPlugin;

import elexa.utils.ReportHandler;

/**
	 * 
	 * Created on May 27, 2017 by Jeremy Gooch.
	 * 
	 */

public class Elexa extends JavaPlugin {
	
	private static Elexa instance;
	
	private ReportHandler reportHandler;
	
	public void onEnable() {
		
		instance = this;
		reportHandler = new ReportHandler();
		
	}
	
	public void onDisable() {
		
		instance = null;
		
	}
	
	public ReportHandler getReportHandler() {
		return reportHandler;
	}
	
	public static Elexa get() {
		return instance;
	}
}
