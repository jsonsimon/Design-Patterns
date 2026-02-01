This assignment really made me realize the usefullness of Interfaces and Abstract classes when creating similar things

Example:
	AbstractClass factory = new getFactory(); // Where factory can be any class that extends the abstract one.
And then using the same for the interface:
	Interface exporter = factory.createExporter();

I feel like I had to make a lot of classes to make this work.
