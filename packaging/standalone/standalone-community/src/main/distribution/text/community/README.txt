ONgDB #{ongdb.version}
=======================================

Welcome to ONgDB release #{ongdb.version}, a high-performance graph database.
This is the community distribution of ONgDB, including everything you need to
start building applications that can model, persist and explore graph-like data.

In the box
----------

ONgDB runs as a server application, exposing a Web-based management
interface and RESTful endpoints for data access.

Here in the installation directory, you'll find:

* bin - scripts and other executables
* conf - server configuration
* data - databases
* lib - libraries
* plugins - user extensions
* logs - log files
* import - location of files for LOAD CSV

Make it go
----------

For full instructions, see https://graphfoundation.org/ongdb/docs/operations-manual/current/installation/

To get started with ONgDB, let's start the server and take a
look at the web interface ...

1. Open a console and navigate to the install directory.
2. Start the server:
   * Windows, use: bin\ongdb console
   * Linux/Mac, use: ./bin/ongdb console
3. In a browser, open http://localhost:#{default.http.port}/
4. From any REST client or browser, open http://localhost:#{default.http.port}/db/data
   in order to get a REST starting point, e.g.
   curl -v http://localhost:#{default.http.port}/db/data
5. Shutdown the server by typing Ctrl-C in the console.

Learn more
----------

* ONgDB Home: https://graphfoundation.org/
* Getting Started: https://graphfoundation.org/ongdb/docs/developer-manual/current/introduction/
* ONgDB Documentation: https://graphfoundation.org/ongdb/docs/

License(s)
----------
Various licenses apply. Please refer to the LICENSE and NOTICE files for more
detailed information.
