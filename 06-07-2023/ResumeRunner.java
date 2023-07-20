class ResumeRunner{
	public static void main(String [] args)
	{
		System.out.println("Running main in ResumeRunner");
		
		Resume.format();
		Resume.format("Profile");
		Resume.format("Profile",2);
		Resume.clear();
		Resume.delete();
	}
}