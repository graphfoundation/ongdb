## Guidelines

Please note that GitHub issues are only meant for bug reports/feature requests. If you have questions on how to use ONgDB, please ask on [StackOverflow](http://stackoverflow.com/questions/tagged/ongdb) instead of creating an issue here.

If you want to make a feature request then there is no guideline, so feel free to stop reading and open an issue. If you have a bug report however, please continue reading.
To help us understand your issue, please specify important details, primarily:

- ONgDB version: X.Y.Z
- Operating system: (for example Windows 95/Ubuntu 16.04)
- API/Driver: (for example Geequel/Java API/Python driver vX.Y.Z)
- **Steps to reproduce**
- Expected behavior
- Actual behavior

Additionally, include (as appropriate) log-files, stacktraces, and other debug output.

## Example bug report

I discovered that when I mount `data/` to a volume on my host, and then stop the container, the `write.lock` is not removed as well as a number of other files not being cleaned up properly.

**ONgDB Version:** 1.0.0
**Operating System:** Ubuntu 16.04
**API:** Docker

### Steps to reproduce
1. Pull the image: `docker pull graphfoundation/ongdb:1.0.0`
2. Create a directory on the host that will be a mount for the data: `mkdir /home/ongdb-data`
3. Start a new container that mounts to this directory: `docker run -d --name ongdb-test -p 7474:7474 -v /home/ongdb:/data graphfoundation/ongdb:1.0.0`
4. Navigate to the `write.lock` file located in the directory: `/data/databases/graph.db/schema/label/lucene/labelStore/1/`
5. Stop the container: `docker stop ongdb-test`

### Expected behavior
`write.lock` should be removed now.

### Actual behavior
`write.lock` is still present and preventing access by other programs.
