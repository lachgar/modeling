About this project
==================

This project was done as part of my combined assignment for both my masters [Computer Science](http://www.utwente.nl/csc/) and [Human Media Interaction](http://www.utwente.nl/hmi/), at the [Department of Electrical Engineering, Mathematics and Computer Science](http://www.utwente.nl/en/education/eemcs/) of the [University of Twente](http://www.utwente.nl/en/) in Enschede, the Netherlands.

The goal of my master assignment was to research how Model-Driven Engineering can be used to generate mobile application user interfaces for multi-platform applications. For this project I adopted the Android platform.

While there still is a lot of work to do before this project becomes feasible, I did manage to design mulitple metamodels that are able to represent an application under development at different levels of abstraction, as well did I develop two model-to-model transformations and model-to-text transformations to generate a working Android application. Only smartphone applications are able to run, but multiple layouts to support multiple platforms are generated.

Before you'll understand the ins and outs of this project, you should know about metamodeling, as well as model-to-model and model-to-text transformations. Terms such as OMG, MDA, MDE, QVT, ATL and OCL should sound familiar.


Installation instructions
=========================

These are very, very, very basic installation instructions. It does not tell you _how_ to install the Android SDK, only that you should and where you can find it. Configuring this is easy once you how to, but it can be a bit of a struggle at first. If (after some struggle) you have any issues with installing the environment, feel free to contact me.

1. Download Eclipse Modeling from eclipse.org/downloads
2. Install (=extract) Eclipse to a folder
3. Start Eclipse
4. In Eclipse, perform the following steps to install the environment:
	1. Help -> Install Modeling Components and select Xpand, ATL, Xtext, OCL tools -> Finish/Install
	2. Help -> Install New Software
		1. Add... Name: ADT Plugin, Location: https://dl-ssl.google.com/android/eclipse/
		2. Check "Developer Tools"
		3. Next -> Next -> Accept -> Finish
5. Install the Android SDK from http://developer.android.com/sdk/index.html
	1. After installation, create an empty Android application in Eclipse on the same level where you create the modeling project, and call it "msc.gen.android". If you don't use this name, modify build.xml.
6. Install Ant from http://ant.apache.org/ according to instructions
7. File -> Import... and browse to your modeling project (don't copy to workspace)
8. Select ATL view in top right of Eclipse
9. Generation!
	1. Adjust SigmaxApp.xmi to satisfy requirements (it's a zoo, currently)
	2. Run model-to-model transformation sigmaxapp2screens.atl
	3. Run model-to-model transformation screens2android.atl
	4. Run model-to-text transformation android2text.mwe (.mwe, not .xpt) Found in 'workflow'
10. Open terminal and go to your modeling folder
	1. Modify ant so that the target directory matches the Android project you created in step 5.1.
	2. Running 'ant cc' will copy all generated files and your 'extras' to the target directory
	3. Compile and run your Android project!

Chaining run configurations
---------------------------

When making changes to the source model you have to run each transformation manually each time. There is a package that allows you to chain run configurations in Eclipse. It's a bit of overhead, but the 'C/C++ Remote Launch for Launch Group configurations' package available in the Eclipse add-on repository has this feature.
