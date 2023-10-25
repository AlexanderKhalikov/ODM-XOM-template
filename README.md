# Make your ODM developers life easier

This is a project specifically designed for Technical users of IBM ODM.
In order to run it you need to install Eclipse IDE with Rule Designer plugin.

The instructions are presented on IBM documentation page:

https://www.ibm.com/docs/en/odm/8.12.0?topic=8120-installing-rule-designer

https://www.eclipse.org/downloads/packages/release/2022-06/r

Install Java11 and specify it in your eclipse.ini file under -vm

Go to your eclipse marketplace and install Rule Designer 12

Create a new Java Project and insert Batch_Processing_Project_XOM into it.

Perform mvn install command:

```mvn install```

Create a new Rule Project and paste everything from Batch_Processing_Project folder into it.

Follow the Rule Project Map instructions in your Rule Designer. 
