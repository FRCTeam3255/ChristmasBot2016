package org.usfirst.frc.team3255.ChristmasBot2016.commands;

import org.usfirst.frc.team3255.ChristmasBot2016.OI;
import org.usfirst.frc.team3255.ChristmasBot2016.subsystems.*;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	public static Drivetrain drivetrain;
	public static Shooter shooter;
	public static OI oi;

	public CommandBase() {	
	}

	public static void init() {
		drivetrain = new Drivetrain();
		shooter = new Shooter();
		oi = new OI();
	}
}
