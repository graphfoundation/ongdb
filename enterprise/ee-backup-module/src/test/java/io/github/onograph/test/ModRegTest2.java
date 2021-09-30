package io.github.onograph.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ModRegTest2 {

  public static boolean debug = false;

  @Test
  public void test1001() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1001");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory7.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory13.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment19 = factory13.bulBackupEnvironment();
    boolean boolean20 = backupEnvironment19.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional21 = backupEnvironment19.geicmaOptional();
    java.nio.file.Path path22 = backupEnvironment19.getPbPath();
    java.nio.file.Path path23 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path22);
    java.nio.file.Path path24 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path23);
    boolean boolean25 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path24);
    java.nio.file.Path path26 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path24);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory27.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory27.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory33.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory33.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment39 = factory33.bulBackupEnvironment();
    boolean boolean40 = backupEnvironment39.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional41 = backupEnvironment39.geicmaOptional();
    java.nio.file.Path path42 = backupEnvironment39.getPbPath();
    java.nio.file.Path path43 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path42);
    java.nio.file.Path path44 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path43);
    io.github.onograph.backup.FileMoverService fileMoverService45 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path24, path43);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory4.prPath(path43);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory4.isSicc(
        (java.lang.Boolean) false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions49 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory4.miAuthMetaOptions(
        authMetaOptions49);
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory51.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory51.isRp(false);
    java.nio.file.Path path56 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory55.prPath(path56);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory57.isFtfb(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory60.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory64 = factory60.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory66 = factory60.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory68 = factory66.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory71 = factory66.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment72 = factory66.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern73 = backupEnvironment72.getDatabaseNamePattern();
    boolean boolean74 = backupEnvironment72.getIsBftf();
    org.neo4j.configuration.helpers.SocketAddress socketAddress75 = backupEnvironment72.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory76 = factory57.wihadsBackupEnvironmentFactory(
        socketAddress75);
    io.github.onograph.backup.BackupEnvironment.Factory factory77 = factory50.wihadsBackupEnvironmentFactory(
        socketAddress75);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(backupEnvironment19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional21);
    org.junit.Assert.assertNotNull(path22);
    org.junit.Assert.assertNotNull(path23);
    org.junit.Assert.assertNotNull(path24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(path26);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(backupEnvironment39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional41);
    org.junit.Assert.assertNotNull(path42);
    org.junit.Assert.assertNotNull(path43);
    org.junit.Assert.assertNotNull(path44);
    org.junit.Assert.assertNotNull(fileMoverService45);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(factory64);
    org.junit.Assert.assertNotNull(factory66);
    org.junit.Assert.assertNotNull(factory68);
    org.junit.Assert.assertNotNull(factory71);
    org.junit.Assert.assertNotNull(backupEnvironment72);
    org.junit.Assert.assertNotNull(databaseNamePattern73);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    org.junit.Assert.assertNotNull(socketAddress75);
    org.junit.Assert.assertNotNull(factory76);
    org.junit.Assert.assertNotNull(factory77);
  }

  @Test
  public void test1002() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1002");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = factory2.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory2.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    java.nio.file.Path path11 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory8.prPath(path11);
    java.nio.file.Path path13 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.prPath(path13);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isCc(false);
    java.nio.file.Path path18 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory15.prPath(path18);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config21 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.config(config21);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory22.isRp(true);
    org.neo4j.configuration.Config config25 = factory22.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory15.config(config25);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory14.config(config25);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory7.config(config25);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction29 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory30.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory30.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory30.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory36.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory36.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment42 = factory36.bulBackupEnvironment();
    boolean boolean43 = backupEnvironment42.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional44 = backupEnvironment42.geicmaOptional();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern45 = backupEnvironment42.getDatabaseNamePattern();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional46 = backupEnvironment42.geicmaOptional();
    org.neo4j.memory.MemoryTracker memoryTracker47 = backupEnvironment42.getMemoryTracker();
    org.neo4j.io.pagecache.PageCache pageCache48 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager49 = new io.github.onograph.backup.BackupRestorationManager(
        config25, fileSystemAbstraction29, memoryTracker47, pageCache48);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction50 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory51.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory51.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory51.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory57.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory57.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment63 = factory57.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker64 = backupEnvironment63.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern65 = backupEnvironment63.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress66 = backupEnvironment63.getSocketAddress();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern67 = backupEnvironment63.getDatabaseNamePattern();
    org.neo4j.memory.MemoryTracker memoryTracker68 = backupEnvironment63.getMemoryTracker();
    org.neo4j.io.pagecache.PageCache pageCache69 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager70 = new io.github.onograph.backup.BackupRestorationManager(
        config25, fileSystemAbstraction50, memoryTracker68, pageCache69);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(config5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(config25);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(backupEnvironment42);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional44);
    org.junit.Assert.assertNotNull(databaseNamePattern45);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional46);
    org.junit.Assert.assertNotNull(memoryTracker47);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(backupEnvironment63);
    org.junit.Assert.assertNotNull(memoryTracker64);
    org.junit.Assert.assertNotNull(databaseNamePattern65);
    org.junit.Assert.assertNotNull(socketAddress66);
    org.junit.Assert.assertNotNull(databaseNamePattern67);
    org.junit.Assert.assertNotNull(memoryTracker68);
  }

  @Test
  public void test1003() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1003");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker13 = backupEnvironment12.getMemoryTracker();
    java.nio.file.Path path14 = backupEnvironment12.getPbPath();
    boolean boolean15 = backupEnvironment12.getIsBftf();
    boolean boolean16 = backupEnvironment12.getIsCc();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional17 = backupEnvironment12.geicmaOptional();
    java.nio.file.Path path18 = backupEnvironment12.getPbPath();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(memoryTracker13);
    org.junit.Assert.assertNotNull(path14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional17);
    org.junit.Assert.assertNotNull(path18);
  }

  @Test
  public void test1004() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1004");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupMetadataRepository backupMetadataRepository1 = new io.github.onograph.backup.BackupMetadataRepository(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker15 = backupEnvironment14.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern16 = backupEnvironment14.getDatabaseNamePattern();
    boolean boolean17 = backupEnvironment14.getIsBftf();
    java.nio.file.Path path18 = backupEnvironment14.getRpPath();
    java.nio.file.Path path19 = backupEnvironment14.getPbPath();
    java.nio.file.Path path20 = backupEnvironment14.getPbPath();
    java.nio.file.Path path21 = backupEnvironment14.getRpPath();
    java.nio.file.Path path22 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path21);
    java.lang.String[] strArray25 = new java.lang.String[]{"", "database.id"};
    java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
    boolean boolean27 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList26, strArray25);
    try {
      backupMetadataRepository1.wrtForPaLi(path21, (java.util.List<java.lang.String>) strList26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertNotNull(memoryTracker15);
    org.junit.Assert.assertNotNull(databaseNamePattern16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertNotNull(path22);
    org.junit.Assert.assertNotNull(strArray25);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
  }

  @Test
  public void test1005() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1005");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional15 = backupEnvironment12.geicmaOptional();
    java.nio.file.Path path16 = backupEnvironment12.getRpPath();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern17 = backupEnvironment12.getDatabaseNamePattern();
    boolean boolean18 = backupEnvironment12.getIsBftf();
    boolean boolean19 = backupEnvironment12.getIsRp();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional15);
    org.junit.Assert.assertNotNull(path16);
    org.junit.Assert.assertNotNull(databaseNamePattern17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
  }

  @Test
  public void test1006() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1006");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    java.io.PrintStream printStream3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(false);
    java.nio.file.Path path7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.prPath(path7);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment backupEnvironment11 = factory10.bulBackupEnvironment();
    java.nio.file.Path path12 = backupEnvironment11.getRpPath();
    boolean boolean13 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path12);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory14.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory14.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory20.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment26 = factory20.bulBackupEnvironment();
    boolean boolean27 = backupEnvironment26.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional28 = backupEnvironment26.geicmaOptional();
    java.nio.file.Path path29 = backupEnvironment26.getPbPath();
    java.nio.file.Path path30 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path29);
    java.nio.file.Path path31 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path30);
    boolean boolean32 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path31);
    java.nio.file.Path path33 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path31);
    java.nio.file.Path path34 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path33);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory35.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory38.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory38.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory44.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory44.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment50 = factory44.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern51 = backupEnvironment50.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress52 = backupEnvironment50.getSocketAddress();
    java.nio.file.Path path53 = backupEnvironment50.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory35.pbPath(path53);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory55.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory58.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory58.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory64 = factory58.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory66 = factory64.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory64.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment70 = factory64.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern71 = backupEnvironment70.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress72 = backupEnvironment70.getSocketAddress();
    java.nio.file.Path path73 = backupEnvironment70.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory74 = factory55.pbPath(path73);
    io.github.onograph.backup.FileMoverService fileMoverService75 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path53, path73);
    java.nio.file.Path path76 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path73);
    io.github.onograph.backup.FileMoverService fileMoverService77 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path33, path76);
    java.nio.file.Path path78 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path33);
    org.neo4j.io.layout.DatabaseLayout databaseLayout79 = null;
    try {
      io.github.onograph.backup.GdbRestorer gdbRestorer80 = new io.github.onograph.backup.GdbRestorer(
          fileSystemAbstraction0, true, false, printStream3, path12, path78, databaseLayout79);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(backupEnvironment11);
    org.junit.Assert.assertNotNull(path12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(backupEnvironment26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional28);
    org.junit.Assert.assertNotNull(path29);
    org.junit.Assert.assertNotNull(path30);
    org.junit.Assert.assertNotNull(path31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    org.junit.Assert.assertNotNull(path33);
    org.junit.Assert.assertNotNull(path34);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(backupEnvironment50);
    org.junit.Assert.assertNotNull(databaseNamePattern51);
    org.junit.Assert.assertNotNull(socketAddress52);
    org.junit.Assert.assertNotNull(path53);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(factory64);
    org.junit.Assert.assertNotNull(factory66);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(backupEnvironment70);
    org.junit.Assert.assertNotNull(databaseNamePattern71);
    org.junit.Assert.assertNotNull(socketAddress72);
    org.junit.Assert.assertNotNull(path73);
    org.junit.Assert.assertNotNull(factory74);
    org.junit.Assert.assertNotNull(fileMoverService75);
    org.junit.Assert.assertNotNull(path76);
    org.junit.Assert.assertNotNull(fileMoverService77);
    org.junit.Assert.assertNotNull(path78);
  }

  @Test
  public void test1007() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1007");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.prPath(path5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isFtfb(true);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = factory8.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory8.wihadsBackupEnvironmentFactory(
        (-1), "");
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isFtfb(true);
    org.neo4j.configuration.Config config15 = factory12.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory16.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory16.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory22.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory22.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment28 = factory22.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern29 = backupEnvironment28.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress30 = backupEnvironment28.getSocketAddress();
    java.nio.file.Path path31 = backupEnvironment28.getRpPath();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern32 = backupEnvironment28.getDatabaseNamePattern();
    boolean boolean33 = backupEnvironment28.getIsCc();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern34 = backupEnvironment28.getDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory12.databaseNamePattern(
        databaseNamePattern34);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNull(socketAddress9);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(config15);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(backupEnvironment28);
    org.junit.Assert.assertNotNull(databaseNamePattern29);
    org.junit.Assert.assertNotNull(socketAddress30);
    org.junit.Assert.assertNotNull(path31);
    org.junit.Assert.assertNotNull(databaseNamePattern32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    org.junit.Assert.assertNotNull(databaseNamePattern34);
    org.junit.Assert.assertNotNull(factory35);
  }

  @Test
  public void test1008() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1008");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator2.fFileSystemAbstraction(
        fileSystemAbstraction7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator8.itraLogProvider(
        logProvider9);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator8.progressMonitorFactory(
        progressMonitorFactory11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.itraLogProvider(
        logProvider13);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator14.fFileSystemAbstraction(
        fileSystemAbstraction15);
    org.neo4j.monitoring.Monitors monitors17 = null;
    io.github.onograph.backup.BackupRunner.Generator generator18 = generator16.monitors(monitors17);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
    org.junit.Assert.assertNotNull(generator18);
  }

  @Test
  public void test1009() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1009");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup3.isCc(true);
    io.github.onograph.backup.Backup backup7 = backup5.isCc(true);
    io.github.onograph.backup.Backup backup9 = backup5.isBftf(true);
    io.github.onograph.backup.Backup backup11 = backup9.isBftf(true);
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
    org.junit.Assert.assertNotNull(backup11);
  }

  @Test
  public void test1010() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1010");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker15 = backupEnvironment14.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern16 = backupEnvironment14.getDatabaseNamePattern();
    boolean boolean17 = backupEnvironment14.getIsBftf();
    org.neo4j.configuration.helpers.SocketAddress socketAddress18 = backupEnvironment14.getSocketAddress();
    java.nio.file.Path path19 = backupEnvironment14.getRpPath();
    java.nio.file.Path path20 = backupEnvironment14.getRpPath();
    try {
      backupIOService1.deedForPa(path20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertNotNull(memoryTracker15);
    org.junit.Assert.assertNotNull(databaseNamePattern16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(socketAddress18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
  }

  @Test
  public void test1011() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1011");
    }
    io.github.onograph.backup.BackupMetaDTO backupMetaDTO0 = null;
    java.lang.String[] strArray4 = new java.lang.String[]{"hi!", "", "hi!"};
    java.util.ArrayList<java.lang.String> strList5 = new java.util.ArrayList<java.lang.String>();
    boolean boolean6 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList5, strArray4);
    try {
      io.github.onograph.backup.BackupMetaService.wrtmedaForBaLi(backupMetaDTO0,
          (java.util.List<java.lang.String>) strList5);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(strArray4);
    org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
  }

  @Test
  public void test1012() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1012");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    boolean boolean15 = backupEnvironment14.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment14.geicmaOptional();
    java.nio.file.Path path17 = backupEnvironment14.getPbPath();
    java.nio.file.Path path18 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path17);
    java.nio.file.Path path19 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path18);
    java.nio.file.Path path20 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config22 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.config(config22);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isRp(true);
    org.neo4j.configuration.Config config26 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.config(config26);
    org.neo4j.configuration.helpers.SocketAddress socketAddress28 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory25.wihadsBackupEnvironmentFactory(
        socketAddress28);
    org.neo4j.configuration.helpers.SocketAddress socketAddress30 = factory25.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory25.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment backupEnvironment35 = factory34.bulBackupEnvironment();
    java.nio.file.Path path36 = backupEnvironment35.getPbPath();
    io.github.onograph.backup.FileMoverService fileMoverService37 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path20, path36);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory38.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory38.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory44.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory44.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment50 = factory44.bulBackupEnvironment();
    boolean boolean51 = backupEnvironment50.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional52 = backupEnvironment50.geicmaOptional();
    java.nio.file.Path path53 = backupEnvironment50.getPbPath();
    boolean boolean54 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path53);
    io.github.onograph.backup.FileMoverService fileMoverService55 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path20, path53);
    java.nio.file.Path path56 = fileMoverService55.filPath();
    org.neo4j.logging.LogProvider logProvider57 = null;
    org.neo4j.io.pagecache.PageCache pageCache58 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer59 = null;
    try {
      io.github.onograph.backup.BackupMetaService backupMetaService60 = new io.github.onograph.backup.BackupMetaService(
          fileSystemAbstraction0, "database.id", path56, logProvider57, pageCache58,
          pageCacheTracer59);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNull(socketAddress30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(backupEnvironment35);
    org.junit.Assert.assertNotNull(path36);
    org.junit.Assert.assertNotNull(fileMoverService37);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(backupEnvironment50);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional52);
    org.junit.Assert.assertNotNull(path53);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertNotNull(fileMoverService55);
    org.junit.Assert.assertNotNull(path56);
  }

  @Test
  public void test1013() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1013");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern13 = backupEnvironment12.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress14 = backupEnvironment12.getSocketAddress();
    java.nio.file.Path path15 = backupEnvironment12.getRpPath();
    boolean boolean16 = backupEnvironment12.getIsBftf();
    java.nio.file.Path path17 = backupEnvironment12.getRpPath();
    org.neo4j.memory.MemoryTracker memoryTracker18 = backupEnvironment12.getMemoryTracker();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional19 = backupEnvironment12.geicmaOptional();
    boolean boolean20 = backupEnvironment12.getIsCc();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(databaseNamePattern13);
    org.junit.Assert.assertNotNull(socketAddress14);
    org.junit.Assert.assertNotNull(path15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(memoryTracker18);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
  }

  @Test
  public void test1014() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1014");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory4.wihadsBackupEnvironmentFactory(
        (int) (short) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory4.wihadsBackupEnvironmentFactory(
        0, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config18 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.config(config18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isRp(true);
    org.neo4j.configuration.Config config22 = factory19.gecfConfig();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction23 = null;
    org.neo4j.memory.MemoryTracker memoryTracker24 = null;
    org.neo4j.io.pagecache.PageCache pageCache25 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager26 = new io.github.onograph.backup.BackupRestorationManager(
        config22, fileSystemAbstraction23, memoryTracker24, pageCache25);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory4.config(config22);
    org.neo4j.configuration.Config config28 = factory4.gecfConfig();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(config22);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(config28);
  }

  @Test
  public void test1015() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1015");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config8 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.config(config8);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory9.isSicc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern14 = factory9.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory2.databaseNamePattern(
        databaseNamePattern14);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isSicc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory15.isCc(false);
    java.lang.Class<?> wildcardClass20 = factory19.getClass();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(databaseNamePattern14);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(wildcardClass20);
  }

  @Test
  public void test1016() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1016");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isFtfb(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.miAuthMetaOptions(
        authMetaOptions9);
    io.github.onograph.backup.BackupEnvironment backupEnvironment11 = factory10.bulBackupEnvironment();
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory10.isGcc(
        (java.lang.Boolean) true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(backupEnvironment11);
    org.junit.Assert.assertNotNull(factory13);
  }

  @Test
  public void test1017() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1017");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    java.nio.file.Path path3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.prPath(path3);
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config6 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory5.config(config6);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isRp(true);
    org.neo4j.configuration.Config config10 = factory7.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory0.config(config10);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory0.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isCc(false);
    java.nio.file.Path path17 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory14.prPath(path17);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern19 = factory18.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory0.databaseNamePattern(
        databaseNamePattern19);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(config10);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(databaseNamePattern19);
    org.junit.Assert.assertNotNull(factory20);
  }

  @Test
  public void test1018() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1018");
    }
    io.github.onograph.backup.Backup backup2 = io.github.onograph.backup.Backup.froBackup(1, "hi!");
    org.junit.Assert.assertNotNull(backup2);
  }

  @Test
  public void test1019() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1019");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.isCc(false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
  }

  @Test
  public void test1020() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1020");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern15 = backupEnvironment12.getDatabaseNamePattern();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment12.geicmaOptional();
    org.neo4j.memory.MemoryTracker memoryTracker17 = backupEnvironment12.getMemoryTracker();
    boolean boolean18 = backupEnvironment12.getIsRp();
    java.nio.file.Path path19 = backupEnvironment12.getPbPath();
    org.neo4j.memory.MemoryTracker memoryTracker20 = backupEnvironment12.getMemoryTracker();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(databaseNamePattern15);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(memoryTracker17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(memoryTracker20);
  }

  @Test
  public void test1021() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1021");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    org.neo4j.logging.LogProvider logProvider1 = null;
    org.neo4j.logging.Log log2 = null;
    io.github.onograph.backup.RemoteBackupService remoteBackupService3 = new io.github.onograph.backup.RemoteBackupService(
        fileSystemAbstraction0, logProvider1, log2);
    io.github.onograph.backup.BackupVerificationService backupVerificationService4 = io.github.onograph.backup.BackupVerificationService.NOO_BACKUP_VERIFICATION_SERVICE;
    org.neo4j.io.layout.DatabaseLayout databaseLayout5 = null;
    backupVerificationService4.chcsyForDa(databaseLayout5);
    org.neo4j.io.layout.DatabaseLayout databaseLayout7 = null;
    backupVerificationService4.chcsyForDa(databaseLayout7);
    org.neo4j.io.layout.DatabaseLayout databaseLayout9 = null;
    backupVerificationService4.chcsyForDa(databaseLayout9);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory11.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory11.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory17.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment23 = factory17.bulBackupEnvironment();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional24 = backupEnvironment23.geicmaOptional();
    io.github.onograph.backup.DefaultBackupServiceHandler defaultBackupServiceHandler26 = null;
    io.github.onograph.backup.GdbStoreTransferWatcherRebImpl gdbStoreTransferWatcherRebImpl27 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer28 = null;
    io.github.onograph.backup.RemoteBackupManager remoteBackupManager29 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config31 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory30.config(config31);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isRp(true);
    org.neo4j.configuration.Config config35 = factory32.gecfConfig();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction36 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.isCc(false);
    java.nio.file.Path path40 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory37.prPath(path40);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory37.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory44.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory44.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory49.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory49.isRp(false);
    java.nio.file.Path path54 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory53.prPath(path54);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern56 = factory55.gedtenprDatabaseNamePattern();
    org.neo4j.configuration.Config config57 = factory55.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = factory48.config(config57);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory37.config(config57);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction60 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory61.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory65 = factory61.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = factory61.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory67.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory72 = factory67.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment73 = factory67.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker74 = backupEnvironment73.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern75 = backupEnvironment73.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress76 = backupEnvironment73.getSocketAddress();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern77 = backupEnvironment73.getDatabaseNamePattern();
    org.neo4j.memory.MemoryTracker memoryTracker78 = backupEnvironment73.getMemoryTracker();
    org.neo4j.io.pagecache.PageCache pageCache79 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager80 = new io.github.onograph.backup.BackupRestorationManager(
        config57, fileSystemAbstraction60, memoryTracker78, pageCache79);
    org.neo4j.io.pagecache.PageCache pageCache81 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager82 = new io.github.onograph.backup.BackupRestorationManager(
        config35, fileSystemAbstraction36, memoryTracker78, pageCache81);
    try {
      remoteBackupService3.bakForBaPaBaDeBaReStGd(backupVerificationService4, backupEnvironment23,
          "", defaultBackupServiceHandler26, gdbStoreTransferWatcherRebImpl27, pageCacheTracer28,
          remoteBackupManager29, backupRestorationManager82);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(backupVerificationService4);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(backupEnvironment23);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional24);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(config35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(databaseNamePattern56);
    org.junit.Assert.assertNotNull(config57);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory65);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(factory72);
    org.junit.Assert.assertNotNull(backupEnvironment73);
    org.junit.Assert.assertNotNull(memoryTracker74);
    org.junit.Assert.assertNotNull(databaseNamePattern75);
    org.junit.Assert.assertNotNull(socketAddress76);
    org.junit.Assert.assertNotNull(databaseNamePattern77);
    org.junit.Assert.assertNotNull(memoryTracker78);
  }

  @Test
  public void test1022() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1022");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern13 = backupEnvironment12.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress14 = backupEnvironment12.getSocketAddress();
    java.nio.file.Path path15 = backupEnvironment12.getRpPath();
    boolean boolean16 = backupEnvironment12.getIsBftf();
    java.nio.file.Path path17 = backupEnvironment12.getRpPath();
    org.neo4j.memory.MemoryTracker memoryTracker18 = backupEnvironment12.getMemoryTracker();
    java.nio.file.Path path19 = backupEnvironment12.getRpPath();
    java.nio.file.Path path20 = backupEnvironment12.getRpPath();
    java.nio.file.Path path21 = backupEnvironment12.getRpPath();
    boolean boolean22 = backupEnvironment12.getIsCc();
    java.nio.file.Path path23 = backupEnvironment12.getPbPath();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(databaseNamePattern13);
    org.junit.Assert.assertNotNull(socketAddress14);
    org.junit.Assert.assertNotNull(path15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(memoryTracker18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    org.junit.Assert.assertNotNull(path23);
  }

  @Test
  public void test1023() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1023");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory4.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.shouldPrep(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.databaseNamePattern(
        "database.id");
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
  }

  @Test
  public void test1024() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1024");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup3.isCc(true);
    io.github.onograph.backup.Backup backup7 = backup5.isCc(true);
    io.github.onograph.backup.Backup backup9 = backup5.isCc(true);
    io.github.onograph.backup.Backup backup11 = backup5.isBftf(false);
    io.github.onograph.backup.Backup backup13 = backup11.isBftf(true);
    io.github.onograph.backup.Backup backup15 = backup11.isBftf(true);
    io.github.onograph.backup.Backup backup17 = backup11.isBftf(false);
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
    org.junit.Assert.assertNotNull(backup11);
    org.junit.Assert.assertNotNull(backup13);
    org.junit.Assert.assertNotNull(backup15);
    org.junit.Assert.assertNotNull(backup17);
  }

  @Test
  public void test1025() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1025");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    java.nio.file.Path path3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.prPath(path3);
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config6 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory5.config(config6);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isRp(true);
    org.neo4j.configuration.Config config10 = factory7.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory0.config(config10);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction12 = null;
    org.neo4j.configuration.Config config13 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction14 = null;
    java.nio.file.Path[] pathArray15 = new java.nio.file.Path[]{};
    java.util.LinkedHashSet<java.nio.file.Path> pathSet16 = new java.util.LinkedHashSet<java.nio.file.Path>();
    boolean boolean17 = java.util.Collections.addAll(
        (java.util.Collection<java.nio.file.Path>) pathSet16, pathArray15);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta18 = new io.github.onograph.backup.BackupRestoreMeta(
        config13, fileSystemAbstraction14, (java.util.Set<java.nio.file.Path>) pathSet16);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta19 = new io.github.onograph.backup.BackupRestoreMeta(
        config10, fileSystemAbstraction12, (java.util.Set<java.nio.file.Path>) pathSet16);
    org.neo4j.consistency.checking.full.ConsistencyFlags consistencyFlags20 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.logging.LogProvider logProvider22 = null;
    java.nio.file.Path path23 = null;
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory24 = null;
    io.github.onograph.backup.BackupVerificationServiceImpl backupVerificationServiceImpl25 = new io.github.onograph.backup.BackupVerificationServiceImpl(
        config10, consistencyFlags20, fileSystemAbstraction21, logProvider22, path23,
        progressMonitorFactory24);
    org.neo4j.consistency.checking.full.ConsistencyFlags consistencyFlags26 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction27 = null;
    org.neo4j.logging.LogProvider logProvider28 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory29.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory29.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory29.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory35.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory35.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment41 = factory35.bulBackupEnvironment();
    boolean boolean42 = backupEnvironment41.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional43 = backupEnvironment41.geicmaOptional();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern44 = backupEnvironment41.getDatabaseNamePattern();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional45 = backupEnvironment41.geicmaOptional();
    org.neo4j.memory.MemoryTracker memoryTracker46 = backupEnvironment41.getMemoryTracker();
    org.neo4j.configuration.helpers.SocketAddress socketAddress47 = backupEnvironment41.getSocketAddress();
    java.nio.file.Path path48 = backupEnvironment41.getRpPath();
    java.nio.file.Path path49 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path48);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory50 = null;
    io.github.onograph.backup.BackupVerificationServiceImpl backupVerificationServiceImpl51 = new io.github.onograph.backup.BackupVerificationServiceImpl(
        config10, consistencyFlags26, fileSystemAbstraction27, logProvider28, path49,
        progressMonitorFactory50);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory52.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions55 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory52.miAuthMetaOptions(
        authMetaOptions55);
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = factory56.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory58.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory58.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory65 = factory63.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = factory63.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory63.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory71 = factory69.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory74 = factory69.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment75 = factory69.bulBackupEnvironment();
    boolean boolean76 = backupEnvironment75.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional77 = backupEnvironment75.geicmaOptional();
    java.nio.file.Path path78 = backupEnvironment75.getPbPath();
    java.nio.file.Path path79 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path78);
    java.nio.file.Path path80 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path79);
    boolean boolean81 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path80);
    java.nio.file.Path path82 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path80);
    java.nio.file.Path path83 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path82);
    io.github.onograph.backup.BackupEnvironment.Factory factory84 = factory58.pbPath(path82);
    io.github.onograph.backup.FileMoverService fileMoverService85 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path49, path82);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(config10);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(pathArray15);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(backupEnvironment41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional43);
    org.junit.Assert.assertNotNull(databaseNamePattern44);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional45);
    org.junit.Assert.assertNotNull(memoryTracker46);
    org.junit.Assert.assertNotNull(socketAddress47);
    org.junit.Assert.assertNotNull(path48);
    org.junit.Assert.assertNotNull(path49);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory65);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(factory71);
    org.junit.Assert.assertNotNull(factory74);
    org.junit.Assert.assertNotNull(backupEnvironment75);
    org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional77);
    org.junit.Assert.assertNotNull(path78);
    org.junit.Assert.assertNotNull(path79);
    org.junit.Assert.assertNotNull(path80);
    org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    org.junit.Assert.assertNotNull(path82);
    org.junit.Assert.assertNotNull(path83);
    org.junit.Assert.assertNotNull(factory84);
    org.junit.Assert.assertNotNull(fileMoverService85);
  }

  @Test
  public void test1026() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1026");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isFtfb(false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
  }

  @Test
  public void test1027() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1027");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.databaseNamePattern(
        "database.id");
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions12 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory9.miAuthMetaOptions(
        authMetaOptions12);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isIcc(
        (java.lang.Boolean) false);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern18 = factory15.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory4.databaseNamePattern(
        databaseNamePattern18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isCc(false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(databaseNamePattern18);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
  }

  @Test
  public void test1028() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1028");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    org.neo4j.configuration.helpers.SocketAddress socketAddress3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.wihadsBackupEnvironmentFactory(
        socketAddress3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config12 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.config(config12);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory13.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory13.isFtfb(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory13.wihadsBackupEnvironmentFactory(
        (int) (byte) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory13.wihadsBackupEnvironmentFactory(
        (int) (short) 100, "");
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory26.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory26.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory32.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment38 = factory32.bulBackupEnvironment();
    boolean boolean39 = backupEnvironment38.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional40 = backupEnvironment38.geicmaOptional();
    org.neo4j.configuration.helpers.SocketAddress socketAddress41 = backupEnvironment38.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory13.wihadsBackupEnvironmentFactory(
        socketAddress41);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory43.isCc(false);
    java.nio.file.Path path46 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory43.prPath(path46);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config49 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory48.config(config49);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory50.isRp(true);
    org.neo4j.configuration.Config config53 = factory50.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory43.config(config53);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction55 = null;
    org.neo4j.configuration.Config config56 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction57 = null;
    java.nio.file.Path[] pathArray58 = new java.nio.file.Path[]{};
    java.util.LinkedHashSet<java.nio.file.Path> pathSet59 = new java.util.LinkedHashSet<java.nio.file.Path>();
    boolean boolean60 = java.util.Collections.addAll(
        (java.util.Collection<java.nio.file.Path>) pathSet59, pathArray58);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta61 = new io.github.onograph.backup.BackupRestoreMeta(
        config56, fileSystemAbstraction57, (java.util.Set<java.nio.file.Path>) pathSet59);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta62 = new io.github.onograph.backup.BackupRestoreMeta(
        config53, fileSystemAbstraction55, (java.util.Set<java.nio.file.Path>) pathSet59);
    org.neo4j.consistency.checking.full.ConsistencyFlags consistencyFlags63 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction64 = null;
    org.neo4j.logging.LogProvider logProvider65 = null;
    java.nio.file.Path path66 = null;
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory67 = null;
    io.github.onograph.backup.BackupVerificationServiceImpl backupVerificationServiceImpl68 = new io.github.onograph.backup.BackupVerificationServiceImpl(
        config53, consistencyFlags63, fileSystemAbstraction64, logProvider65, path66,
        progressMonitorFactory67);
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory42.config(config53);
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = factory10.config(config53);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(backupEnvironment38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional40);
    org.junit.Assert.assertNotNull(socketAddress41);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(config53);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(pathArray58);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(factory70);
  }

  @Test
  public void test1029() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1029");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    org.neo4j.configuration.helpers.SocketAddress socketAddress15 = backupEnvironment12.getSocketAddress();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment12.geicmaOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional17 = backupEnvironment12.geicmaOptional();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(socketAddress15);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional17);
  }

  @Test
  public void test1030() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1030");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupMetadataRepository backupMetadataRepository1 = new io.github.onograph.backup.BackupMetadataRepository(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    boolean boolean15 = backupEnvironment14.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment14.geicmaOptional();
    java.nio.file.Path path17 = backupEnvironment14.getPbPath();
    java.nio.file.Path path18 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path17);
    java.nio.file.Path path19 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path18);
    java.nio.file.Path path20 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory21.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory21.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory27.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment33 = factory27.bulBackupEnvironment();
    boolean boolean34 = backupEnvironment33.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional35 = backupEnvironment33.geicmaOptional();
    java.nio.file.Path path36 = backupEnvironment33.getPbPath();
    java.nio.file.Path path37 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path36);
    java.nio.file.Path path38 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path37);
    boolean boolean39 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path38);
    java.nio.file.Path path40 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path38);
    io.github.onograph.backup.FileMoverService fileMoverService41 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path20, path40);
    java.lang.String[] strArray45 = new java.lang.String[]{"", "database.id", "hi!"};
    java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
    boolean boolean47 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList46, strArray45);
    try {
      backupMetadataRepository1.wrtForPaLi(path40, (java.util.List<java.lang.String>) strList46);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(backupEnvironment33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional35);
    org.junit.Assert.assertNotNull(path36);
    org.junit.Assert.assertNotNull(path37);
    org.junit.Assert.assertNotNull(path38);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    org.junit.Assert.assertNotNull(path40);
    org.junit.Assert.assertNotNull(fileMoverService41);
    org.junit.Assert.assertNotNull(strArray45);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
  }

  @Test
  public void test1031() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1031");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("hi!");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(false);
    io.github.onograph.backup.Backup backup5 = backup1.isCc(false);
    io.github.onograph.backup.Backup backup7 = backup1.isBftf(true);
    io.github.onograph.backup.Backup backup9 = backup1.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory11.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory11.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory17.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment23 = factory17.bulBackupEnvironment();
    boolean boolean24 = backupEnvironment23.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional25 = backupEnvironment23.geicmaOptional();
    java.nio.file.Path path26 = backupEnvironment23.getPbPath();
    java.nio.file.Path path27 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path26);
    java.nio.file.Path path28 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path27);
    boolean boolean29 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path28);
    java.nio.file.Path path30 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path28);
    java.nio.file.Path path31 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path30);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory35.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory35.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory35.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory41.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory41.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment47 = factory41.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern48 = backupEnvironment47.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress49 = backupEnvironment47.getSocketAddress();
    java.nio.file.Path path50 = backupEnvironment47.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory32.pbPath(path50);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory52.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory55.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory55.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory55.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory61.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory66 = factory61.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment67 = factory61.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern68 = backupEnvironment67.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress69 = backupEnvironment67.getSocketAddress();
    java.nio.file.Path path70 = backupEnvironment67.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory71 = factory52.pbPath(path70);
    io.github.onograph.backup.FileMoverService fileMoverService72 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path50, path70);
    java.nio.file.Path path73 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path70);
    io.github.onograph.backup.FileMoverService fileMoverService74 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path30, path73);
    java.nio.file.Path path75 = fileMoverService74.filPath();
    try {
      io.github.onograph.backup.Backup.BackupRespState backupRespState76 = backup9.bakBackupBackupRespState(
          "hi!", path75);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.RuntimeException; message: *** Error:  3b02b00a-232a-454b-823b-025cc97a58b8");
    } catch (java.lang.RuntimeException e) {
    }
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(backupEnvironment23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional25);
    org.junit.Assert.assertNotNull(path26);
    org.junit.Assert.assertNotNull(path27);
    org.junit.Assert.assertNotNull(path28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(path30);
    org.junit.Assert.assertNotNull(path31);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(backupEnvironment47);
    org.junit.Assert.assertNotNull(databaseNamePattern48);
    org.junit.Assert.assertNotNull(socketAddress49);
    org.junit.Assert.assertNotNull(path50);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory66);
    org.junit.Assert.assertNotNull(backupEnvironment67);
    org.junit.Assert.assertNotNull(databaseNamePattern68);
    org.junit.Assert.assertNotNull(socketAddress69);
    org.junit.Assert.assertNotNull(path70);
    org.junit.Assert.assertNotNull(factory71);
    org.junit.Assert.assertNotNull(fileMoverService72);
    org.junit.Assert.assertNotNull(path73);
    org.junit.Assert.assertNotNull(fileMoverService74);
    org.junit.Assert.assertNotNull(path75);
  }

  @Test
  public void test1032() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1032");
    }
    io.github.onograph.backup.CommandProviderBackupImpl commandProviderBackupImpl0 = new io.github.onograph.backup.CommandProviderBackupImpl();
    org.neo4j.cli.Command.CommandType commandType1 = commandProviderBackupImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType2 = commandProviderBackupImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = commandProviderBackupImpl0.commandType();
    int int4 = commandProviderBackupImpl0.getPriority();
    org.neo4j.cli.Command.CommandType commandType5 = commandProviderBackupImpl0.commandType();
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType5 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType5.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
  }

  @Test
  public void test1033() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1033");
    }
    io.github.onograph.backup.SetupForBackupRestorationCommandProvider setupForBackupRestorationCommandProvider0 = new io.github.onograph.backup.SetupForBackupRestorationCommandProvider();
    org.neo4j.cli.Command.CommandType commandType1 = setupForBackupRestorationCommandProvider0.commandType();
    int int2 = setupForBackupRestorationCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType3 = setupForBackupRestorationCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType4 = setupForBackupRestorationCommandProvider0.commandType();
    int int5 = setupForBackupRestorationCommandProvider0.getPriority();
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.PREPARE_RESTORE + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.PREPARE_RESTORE));
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.PREPARE_RESTORE + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.PREPARE_RESTORE));
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.PREPARE_RESTORE + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.PREPARE_RESTORE));
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
  }

  @Test
  public void test1034() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1034");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.GdbIdRepo gdbIdRepo1 = new io.github.onograph.backup.GdbIdRepo(
        fileSystemAbstraction0);
    org.neo4j.kernel.database.DatabaseId databaseId2 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory3 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config4 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = factory3.config(config4);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory5.isRp(true);
    org.neo4j.configuration.Config config8 = factory5.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory5.isCc(true);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions11 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory5.miAuthMetaOptions(
        authMetaOptions11);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory13.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory13.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory19.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment25 = factory19.bulBackupEnvironment();
    boolean boolean26 = backupEnvironment25.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional27 = backupEnvironment25.geicmaOptional();
    java.nio.file.Path path28 = backupEnvironment25.getPbPath();
    java.nio.file.Path path29 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path28);
    java.nio.file.Path path30 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path29);
    boolean boolean31 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path30);
    java.nio.file.Path path32 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path30);
    java.nio.file.Path path33 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path32);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory34.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory37.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory37.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory43.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory43.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment49 = factory43.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern50 = backupEnvironment49.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress51 = backupEnvironment49.getSocketAddress();
    java.nio.file.Path path52 = backupEnvironment49.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory34.pbPath(path52);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory54.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory57.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory57.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory57.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory65 = factory63.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory68 = factory63.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment69 = factory63.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern70 = backupEnvironment69.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress71 = backupEnvironment69.getSocketAddress();
    java.nio.file.Path path72 = backupEnvironment69.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory73 = factory54.pbPath(path72);
    io.github.onograph.backup.FileMoverService fileMoverService74 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path52, path72);
    java.nio.file.Path path75 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path72);
    io.github.onograph.backup.FileMoverService fileMoverService76 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path32, path75);
    java.nio.file.Path path77 = fileMoverService76.filPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory78 = factory5.prPath(path77);
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config80 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory79.config(config80);
    io.github.onograph.backup.BackupEnvironment.Factory factory83 = factory81.isRp(true);
    org.neo4j.configuration.Config config84 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory85 = factory83.config(config84);
    org.neo4j.configuration.helpers.SocketAddress socketAddress86 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory87 = factory83.wihadsBackupEnvironmentFactory(
        socketAddress86);
    org.neo4j.configuration.helpers.SocketAddress socketAddress88 = factory83.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory90 = factory83.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory92 = factory90.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment backupEnvironment93 = factory92.bulBackupEnvironment();
    java.nio.file.Path path94 = backupEnvironment93.getPbPath();
    io.github.onograph.backup.FileMoverService fileMoverService95 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path77, path94);
    try {
      gdbIdRepo1.wrdaiForDaPa(databaseId2, path94);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory3);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(config8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(backupEnvironment25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional27);
    org.junit.Assert.assertNotNull(path28);
    org.junit.Assert.assertNotNull(path29);
    org.junit.Assert.assertNotNull(path30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(path32);
    org.junit.Assert.assertNotNull(path33);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(backupEnvironment49);
    org.junit.Assert.assertNotNull(databaseNamePattern50);
    org.junit.Assert.assertNotNull(socketAddress51);
    org.junit.Assert.assertNotNull(path52);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory65);
    org.junit.Assert.assertNotNull(factory68);
    org.junit.Assert.assertNotNull(backupEnvironment69);
    org.junit.Assert.assertNotNull(databaseNamePattern70);
    org.junit.Assert.assertNotNull(socketAddress71);
    org.junit.Assert.assertNotNull(path72);
    org.junit.Assert.assertNotNull(factory73);
    org.junit.Assert.assertNotNull(fileMoverService74);
    org.junit.Assert.assertNotNull(path75);
    org.junit.Assert.assertNotNull(fileMoverService76);
    org.junit.Assert.assertNotNull(path77);
    org.junit.Assert.assertNotNull(factory78);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(factory83);
    org.junit.Assert.assertNotNull(factory85);
    org.junit.Assert.assertNotNull(factory87);
    org.junit.Assert.assertNull(socketAddress88);
    org.junit.Assert.assertNotNull(factory90);
    org.junit.Assert.assertNotNull(factory92);
    org.junit.Assert.assertNotNull(backupEnvironment93);
    org.junit.Assert.assertNotNull(path94);
    org.junit.Assert.assertNotNull(fileMoverService95);
  }

  @Test
  public void test1035() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1035");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.systemNanoClock(
        systemNanoClock7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.itraLogProvider(
        logProvider9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.uLogProvider(
        logProvider11);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator10.fFileSystemAbstraction(
        fileSystemAbstraction13);
    io.github.onograph.backup.BackupRunner backupRunner15 = generator14.bulBackupRunner();
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(backupRunner15);
  }

  @Test
  public void test1036() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1036");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern15 = backupEnvironment12.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern16 = backupEnvironment12.getDatabaseNamePattern();
    java.nio.file.Path path17 = backupEnvironment12.getPbPath();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(databaseNamePattern15);
    org.junit.Assert.assertNotNull(databaseNamePattern16);
    org.junit.Assert.assertNotNull(path17);
  }

  @Test
  public void test1037() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1037");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory13.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory13.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory19.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment25 = factory19.bulBackupEnvironment();
    boolean boolean26 = backupEnvironment25.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional27 = backupEnvironment25.geicmaOptional();
    java.nio.file.Path path28 = backupEnvironment25.getPbPath();
    java.nio.file.Path path29 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path28);
    java.nio.file.Path path30 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path29);
    boolean boolean31 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path30);
    java.nio.file.Path path32 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path30);
    java.nio.file.Path path33 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path32);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory34.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory34.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory34.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory40.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory40.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment46 = factory40.bulBackupEnvironment();
    boolean boolean47 = backupEnvironment46.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional48 = backupEnvironment46.geicmaOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional49 = backupEnvironment46.geicmaOptional();
    java.nio.file.Path path50 = backupEnvironment46.getPbPath();
    java.nio.file.Path path51 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path50);
    io.github.onograph.backup.FileMoverService fileMoverService52 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path32, path50);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory6.pbPath(path50);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(backupEnvironment25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional27);
    org.junit.Assert.assertNotNull(path28);
    org.junit.Assert.assertNotNull(path29);
    org.junit.Assert.assertNotNull(path30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    org.junit.Assert.assertNotNull(path32);
    org.junit.Assert.assertNotNull(path33);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(backupEnvironment46);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional48);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional49);
    org.junit.Assert.assertNotNull(path50);
    org.junit.Assert.assertNotNull(path51);
    org.junit.Assert.assertNotNull(fileMoverService52);
    org.junit.Assert.assertNotNull(factory53);
  }

  @Test
  public void test1038() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1038");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.databaseNamePattern(
        "database.id");
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions12 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory9.miAuthMetaOptions(
        authMetaOptions12);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isIcc(
        (java.lang.Boolean) false);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern18 = factory15.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory4.databaseNamePattern(
        databaseNamePattern18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory4.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory4.isFtfb(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory24.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory24.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory30.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory30.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment36 = factory30.bulBackupEnvironment();
    boolean boolean37 = backupEnvironment36.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional38 = backupEnvironment36.geicmaOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional39 = backupEnvironment36.geicmaOptional();
    java.nio.file.Path path40 = backupEnvironment36.getPbPath();
    java.nio.file.Path path41 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path40);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory4.prPath(path40);
    java.nio.file.Path path43 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path40);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(databaseNamePattern18);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(backupEnvironment36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional38);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional39);
    org.junit.Assert.assertNotNull(path40);
    org.junit.Assert.assertNotNull(path41);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(path43);
  }

  @Test
  public void test1039() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1039");
    }
    io.github.onograph.backup.CommandProviderBackupImpl commandProviderBackupImpl0 = new io.github.onograph.backup.CommandProviderBackupImpl();
    int int1 = commandProviderBackupImpl0.getPriority();
    int int2 = commandProviderBackupImpl0.getPriority();
    org.neo4j.cli.Command.CommandType commandType3 = commandProviderBackupImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType4 = commandProviderBackupImpl0.commandType();
    int int5 = commandProviderBackupImpl0.getPriority();
    org.neo4j.cli.Command.CommandType commandType6 = commandProviderBackupImpl0.commandType();
    int int7 = commandProviderBackupImpl0.getPriority();
    int int8 = commandProviderBackupImpl0.getPriority();
    org.neo4j.cli.ExecutionContext executionContext9 = null;
    try {
      io.github.onograph.backup.BackupCommand backupCommand10 = commandProviderBackupImpl0.createCommand(
          executionContext9);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType6 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType6.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
  }

  @Test
  public void test1040() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1040");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsRp();
    boolean boolean14 = backupEnvironment12.getIsCc();
    boolean boolean15 = backupEnvironment12.getIsBftf();
    boolean boolean16 = backupEnvironment12.getIsCc();
    boolean boolean17 = backupEnvironment12.getIsRp();
    java.nio.file.Path path18 = backupEnvironment12.getPbPath();
    boolean boolean19 = backupEnvironment12.getIsCc();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern20 = backupEnvironment12.getDatabaseNamePattern();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    org.junit.Assert.assertNotNull(databaseNamePattern20);
  }

  @Test
  public void test1041() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1041");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    java.nio.file.Path path3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.prPath(path3);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.prPath(path5);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isCc(false);
    java.nio.file.Path path10 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.prPath(path10);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config13 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.config(config13);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isRp(true);
    org.neo4j.configuration.Config config17 = factory14.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory7.config(config17);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory6.config(config17);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory20.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory20.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory26.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory31.isSicc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory34.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory34.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory34.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory40.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory40.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment46 = factory40.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern47 = backupEnvironment46.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress48 = backupEnvironment46.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory31.wihadsBackupEnvironmentFactory(
        socketAddress48);
    io.github.onograph.backup.BackupEnvironment backupEnvironment50 = factory49.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern51 = backupEnvironment50.getDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory6.databaseNamePattern(
        databaseNamePattern51);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory52.isGcc(
        (java.lang.Boolean) true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(config17);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(backupEnvironment46);
    org.junit.Assert.assertNotNull(databaseNamePattern47);
    org.junit.Assert.assertNotNull(socketAddress48);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(backupEnvironment50);
    org.junit.Assert.assertNotNull(databaseNamePattern51);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
  }

  @Test
  public void test1042() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1042");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern13 = backupEnvironment12.getDatabaseNamePattern();
    boolean boolean14 = backupEnvironment12.getIsBftf();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern15 = backupEnvironment12.getDatabaseNamePattern();
    boolean boolean16 = backupEnvironment12.getIsRp();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(databaseNamePattern13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(databaseNamePattern15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test1043() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1043");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.prPath(path5);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern7 = factory6.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory6.isRp(false);
    java.nio.file.Path path10 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.pbPath(path10);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isCc(false);
    java.nio.file.Path path15 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory12.prPath(path15);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config18 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.config(config18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isRp(true);
    org.neo4j.configuration.Config config22 = factory19.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory12.config(config22);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction24 = null;
    org.neo4j.configuration.Config config25 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction26 = null;
    java.nio.file.Path[] pathArray27 = new java.nio.file.Path[]{};
    java.util.LinkedHashSet<java.nio.file.Path> pathSet28 = new java.util.LinkedHashSet<java.nio.file.Path>();
    boolean boolean29 = java.util.Collections.addAll(
        (java.util.Collection<java.nio.file.Path>) pathSet28, pathArray27);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta30 = new io.github.onograph.backup.BackupRestoreMeta(
        config25, fileSystemAbstraction26, (java.util.Set<java.nio.file.Path>) pathSet28);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta31 = new io.github.onograph.backup.BackupRestoreMeta(
        config22, fileSystemAbstraction24, (java.util.Set<java.nio.file.Path>) pathSet28);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory6.config(config22);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment backupEnvironment35 = factory32.bulBackupEnvironment();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(databaseNamePattern7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(config22);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(pathArray27);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(backupEnvironment35);
  }

  @Test
  public void test1044() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1044");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory4.wihadsBackupEnvironmentFactory(
        (int) (short) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory4.wihadsBackupEnvironmentFactory(
        0, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory4.isRp(true);
    org.neo4j.configuration.Config config19 = factory4.gecfConfig();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(config19);
  }

  @Test
  public void test1045() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1045");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker15 = backupEnvironment14.getMemoryTracker();
    boolean boolean16 = backupEnvironment14.getIsRp();
    java.nio.file.Path path17 = backupEnvironment14.getPbPath();
    boolean boolean18 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path17);
    try {
      backupIOService1.deedForPa(path17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertNotNull(memoryTracker15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test1046() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1046");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.miAuthMetaOptions(
        authMetaOptions7);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory6.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.shouldPrep(false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
  }

  @Test
  public void test1047() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1047");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.prPath(path5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isFtfb(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory10.shouldPrep(true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
  }

  @Test
  public void test1048() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1048");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.FileMover fileMover1 = new io.github.onograph.backup.FileMover(
        fileSystemAbstraction0);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction2 = null;
    io.github.onograph.backup.FileMover fileMover3 = new io.github.onograph.backup.FileMover(
        fileSystemAbstraction2);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction4 = null;
    io.github.onograph.backup.FileMover fileMover5 = new io.github.onograph.backup.FileMover(
        fileSystemAbstraction4);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory6.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory6.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory12.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment18 = factory12.bulBackupEnvironment();
    boolean boolean19 = backupEnvironment18.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional20 = backupEnvironment18.geicmaOptional();
    java.nio.file.Path path21 = backupEnvironment18.getPbPath();
    java.nio.file.Path path22 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path21);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream23 = fileMover5._trrfrmnStream(
        path21);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory27.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory27.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory33.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory33.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment39 = factory33.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern40 = backupEnvironment39.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress41 = backupEnvironment39.getSocketAddress();
    java.nio.file.Path path42 = backupEnvironment39.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory24.pbPath(path42);
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory44.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory47.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory47.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory47.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory53.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = factory53.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment59 = factory53.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern60 = backupEnvironment59.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress61 = backupEnvironment59.getSocketAddress();
    java.nio.file.Path path62 = backupEnvironment59.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory44.pbPath(path62);
    io.github.onograph.backup.FileMoverService fileMoverService64 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path42, path62);
    java.nio.file.Path path65 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path42);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream66 = fileMover5._trrfrmnStream(
        path65);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream67 = fileMover3._trrfrmnStream(
        path65);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction68 = null;
    io.github.onograph.backup.FileMover fileMover69 = new io.github.onograph.backup.FileMover(
        fileSystemAbstraction68);
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory72 = factory70.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory74 = factory70.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory76 = factory70.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory78 = factory76.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory76.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment82 = factory76.bulBackupEnvironment();
    boolean boolean83 = backupEnvironment82.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional84 = backupEnvironment82.geicmaOptional();
    java.nio.file.Path path85 = backupEnvironment82.getPbPath();
    java.nio.file.Path path86 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path85);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream87 = fileMover69._trrfrmnStream(
        path85);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream88 = fileMover3._trrfrmnStream(
        path85);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream89 = fileMover1._trrfrmnStream(
        path85);
    java.nio.file.Path path90 = null;
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream91 = fileMover1._trrfrmnStream(
        path90);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(backupEnvironment18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional20);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertNotNull(path22);
    org.junit.Assert.assertNotNull(fileMoverServiceStream23);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(backupEnvironment39);
    org.junit.Assert.assertNotNull(databaseNamePattern40);
    org.junit.Assert.assertNotNull(socketAddress41);
    org.junit.Assert.assertNotNull(path42);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(backupEnvironment59);
    org.junit.Assert.assertNotNull(databaseNamePattern60);
    org.junit.Assert.assertNotNull(socketAddress61);
    org.junit.Assert.assertNotNull(path62);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(fileMoverService64);
    org.junit.Assert.assertNotNull(path65);
    org.junit.Assert.assertNotNull(fileMoverServiceStream66);
    org.junit.Assert.assertNotNull(fileMoverServiceStream67);
    org.junit.Assert.assertNotNull(factory70);
    org.junit.Assert.assertNotNull(factory72);
    org.junit.Assert.assertNotNull(factory74);
    org.junit.Assert.assertNotNull(factory76);
    org.junit.Assert.assertNotNull(factory78);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(backupEnvironment82);
    org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional84);
    org.junit.Assert.assertNotNull(path85);
    org.junit.Assert.assertNotNull(path86);
    org.junit.Assert.assertNotNull(fileMoverServiceStream87);
    org.junit.Assert.assertNotNull(fileMoverServiceStream88);
    org.junit.Assert.assertNotNull(fileMoverServiceStream89);
    org.junit.Assert.assertNotNull(fileMoverServiceStream91);
  }

  @Test
  public void test1049() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1049");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.systemNanoClock(
        systemNanoClock7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.itraLogProvider(
        logProvider9);
    org.neo4j.time.SystemNanoClock systemNanoClock11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.systemNanoClock(
        systemNanoClock11);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
  }

  @Test
  public void test1050() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1050");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    java.nio.file.Path path3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.prPath(path3);
    org.neo4j.configuration.helpers.SocketAddress socketAddress5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.miAuthMetaOptions(
        authMetaOptions9);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        (int) (short) 0, "");
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory8.isGcc(
        (java.lang.Boolean) false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
  }

  @Test
  public void test1051() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1051");
    }
    io.github.onograph.backup.SetupForBackupRestorationCommandProvider setupForBackupRestorationCommandProvider0 = new io.github.onograph.backup.SetupForBackupRestorationCommandProvider();
    org.neo4j.cli.Command.CommandType commandType1 = setupForBackupRestorationCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType2 = setupForBackupRestorationCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = setupForBackupRestorationCommandProvider0.commandType();
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.PREPARE_RESTORE + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.PREPARE_RESTORE));
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.PREPARE_RESTORE + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.PREPARE_RESTORE));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.PREPARE_RESTORE + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.PREPARE_RESTORE));
  }

  @Test
  public void test1052() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1052");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    boolean boolean15 = backupEnvironment14.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment14.geicmaOptional();
    java.nio.file.Path path17 = backupEnvironment14.getPbPath();
    java.nio.file.Path path18 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path17);
    java.nio.file.Path path19 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path18);
    java.nio.file.Path path20 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config22 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.config(config22);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isRp(true);
    org.neo4j.configuration.Config config26 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.config(config26);
    org.neo4j.configuration.helpers.SocketAddress socketAddress28 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory25.wihadsBackupEnvironmentFactory(
        socketAddress28);
    org.neo4j.configuration.helpers.SocketAddress socketAddress30 = factory25.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory25.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment backupEnvironment35 = factory34.bulBackupEnvironment();
    java.nio.file.Path path36 = backupEnvironment35.getPbPath();
    io.github.onograph.backup.FileMoverService fileMoverService37 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path20, path36);
    try {
      backupIOService1.deedForPa(path36);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNull(socketAddress30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(backupEnvironment35);
    org.junit.Assert.assertNotNull(path36);
    org.junit.Assert.assertNotNull(fileMoverService37);
  }

  @Test
  public void test1053() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1053");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory4.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory4.isCc(true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
  }

  @Test
  public void test1054() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1054");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isSicc(
        (java.lang.Boolean) false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
  }

  @Test
  public void test1055() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1055");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory4.wihadsBackupEnvironmentFactory(
        (int) (short) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory13.isFtfb(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory13.wihadsBackupEnvironmentFactory(
        (int) 'a', "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory13.isRp(true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
  }

  @Test
  public void test1056() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1056");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("hi!");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(false);
    io.github.onograph.backup.Backup backup5 = backup1.isCc(false);
    io.github.onograph.backup.Backup backup7 = backup1.isBftf(true);
    io.github.onograph.backup.Backup backup9 = backup1.isCc(false);
    io.github.onograph.backup.Backup backup11 = backup1.isBftf(false);
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
    org.junit.Assert.assertNotNull(backup11);
  }

  @Test
  public void test1057() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1057");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupMetadataRepository backupMetadataRepository1 = new io.github.onograph.backup.BackupMetadataRepository(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    boolean boolean15 = backupEnvironment14.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment14.geicmaOptional();
    java.nio.file.Path path17 = backupEnvironment14.getPbPath();
    java.nio.file.Path path18 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path17);
    java.nio.file.Path path19 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path18);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory20.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory20.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory26.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment32 = factory26.bulBackupEnvironment();
    boolean boolean33 = backupEnvironment32.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional34 = backupEnvironment32.geicmaOptional();
    java.nio.file.Path path35 = backupEnvironment32.getPbPath();
    java.nio.file.Path path36 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path35);
    io.github.onograph.backup.FileMoverService fileMoverService37 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path18, path36);
    java.nio.file.Path path38 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path18);
    java.lang.String[] strArray41 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
    boolean boolean43 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList42, strArray41);
    try {
      backupMetadataRepository1.wrtForPaLi(path38, (java.util.List<java.lang.String>) strList42);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(backupEnvironment32);
    org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional34);
    org.junit.Assert.assertNotNull(path35);
    org.junit.Assert.assertNotNull(path36);
    org.junit.Assert.assertNotNull(fileMoverService37);
    org.junit.Assert.assertNotNull(path38);
    org.junit.Assert.assertNotNull(strArray41);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
  }

  @Test
  public void test1058() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1058");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator2.fFileSystemAbstraction(
        fileSystemAbstraction7);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator2.progressMonitorFactory(
        progressMonitorFactory9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator2.monitors(monitors11);
    io.github.onograph.backup.BackupRunner backupRunner13 = generator12.bulBackupRunner();
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory14.isRp(false);
    java.nio.file.Path path19 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory18.prPath(path19);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.isFtfb(true);
    org.neo4j.configuration.helpers.SocketAddress socketAddress23 = factory22.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory22.wihadsBackupEnvironmentFactory(
        (-1), "");
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.isFtfb(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory29.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory29.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory29.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory35.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory35.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment41 = factory35.bulBackupEnvironment();
    boolean boolean42 = backupEnvironment41.getIsRp();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional43 = backupEnvironment41.geicmaOptional();
    org.neo4j.configuration.helpers.SocketAddress socketAddress44 = backupEnvironment41.getSocketAddress();
    org.neo4j.configuration.helpers.SocketAddress socketAddress45 = backupEnvironment41.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory28.wihadsBackupEnvironmentFactory(
        socketAddress45);
    io.github.onograph.backup.BackupEnvironment backupEnvironment47 = factory46.bulBackupEnvironment();
    try {
      backupRunner13.excebcpForBa(backupEnvironment47);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(backupRunner13);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNull(socketAddress23);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(backupEnvironment41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional43);
    org.junit.Assert.assertNotNull(socketAddress44);
    org.junit.Assert.assertNotNull(socketAddress45);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(backupEnvironment47);
  }

  @Test
  public void test1059() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1059");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern15 = backupEnvironment12.getDatabaseNamePattern();
    boolean boolean16 = backupEnvironment12.getIsBftf();
    org.neo4j.memory.MemoryTracker memoryTracker17 = backupEnvironment12.getMemoryTracker();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(databaseNamePattern15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(memoryTracker17);
  }

  @Test
  public void test1060() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1060");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory4.wihadsBackupEnvironmentFactory(
        (int) (short) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory4.wihadsBackupEnvironmentFactory(
        0, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.isRp(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions19 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory16.miAuthMetaOptions(
        authMetaOptions19);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
  }

  @Test
  public void test1061() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1061");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.logging.LogProvider logProvider7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.uLogProvider(
        logProvider7);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator8.fFileSystemAbstraction(
        fileSystemAbstraction9);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator8.progressMonitorFactory(
        progressMonitorFactory11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.itraLogProvider(
        logProvider13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator12.uLogProvider(
        logProvider15);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    io.github.onograph.backup.BackupRunner.Generator generator18 = generator12.fFileSystemAbstraction(
        fileSystemAbstraction17);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
    org.junit.Assert.assertNotNull(generator18);
  }

  @Test
  public void test1062() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1062");
    }
    io.github.onograph.backup.CommandProviderBackupImpl commandProviderBackupImpl0 = new io.github.onograph.backup.CommandProviderBackupImpl();
    org.neo4j.cli.Command.CommandType commandType1 = commandProviderBackupImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType2 = commandProviderBackupImpl0.commandType();
    int int3 = commandProviderBackupImpl0.getPriority();
    org.neo4j.cli.Command.CommandType commandType4 = commandProviderBackupImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType5 = commandProviderBackupImpl0.commandType();
    int int6 = commandProviderBackupImpl0.getPriority();
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue(
        "'" + commandType5 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType5.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
  }

  @Test
  public void test1063() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1063");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    boolean boolean15 = backupEnvironment14.getIsBftf();
    org.neo4j.configuration.helpers.SocketAddress socketAddress16 = backupEnvironment14.getSocketAddress();
    java.nio.file.Path path17 = backupEnvironment14.getPbPath();
    try {
      backupIOService1.deedForPa(path17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(socketAddress16);
    org.junit.Assert.assertNotNull(path17);
  }

  @Test
  public void test1064() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1064");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    boolean boolean15 = backupEnvironment14.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment14.geicmaOptional();
    java.nio.file.Path path17 = backupEnvironment14.getPbPath();
    java.nio.file.Path path18 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path17);
    java.nio.file.Path path19 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path18);
    boolean boolean20 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path19);
    java.nio.file.Path path21 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path19);
    java.nio.file.Path path22 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path21);
    java.nio.file.Path path23 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path22);
    try {
      boolean boolean24 = backupIOService1.isExsForPa(path23);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertNotNull(path22);
    org.junit.Assert.assertNotNull(path23);
  }

  @Test
  public void test1065() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1065");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions10 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.miAuthMetaOptions(
        authMetaOptions10);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions14 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.miAuthMetaOptions(
        authMetaOptions14);
    org.neo4j.configuration.Config config16 = factory15.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory2.config(config16);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction18 = null;
    io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl19 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler20 = null;
    org.neo4j.logging.LogProvider logProvider21 = null;
    org.neo4j.monitoring.Monitors monitors22 = null;
    org.neo4j.io.pagecache.PageCache pageCache23 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer24 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock25 = null;
    try {
      io.github.onograph.backup.RemoteBackupManager remoteBackupManager26 = new io.github.onograph.backup.RemoteBackupManager(
          config16, fileSystemAbstraction18, lifecycleCatchupManagerImpl19, jobScheduler20,
          logProvider21, monitors22, pageCache23, pageCacheTracer24, systemNanoClock25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(config16);
    org.junit.Assert.assertNotNull(factory17);
  }

  @Test
  public void test1066() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1066");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isFtfb(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory15.wihadsBackupEnvironmentFactory(
        (int) (short) 1, "");
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory21.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory21.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory27.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment33 = factory27.bulBackupEnvironment();
    boolean boolean34 = backupEnvironment33.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional35 = backupEnvironment33.geicmaOptional();
    java.nio.file.Path path36 = backupEnvironment33.getPbPath();
    boolean boolean37 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path36);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory20.prPath(path36);
    try {
      backupIOService1.deedForPa(path36);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(backupEnvironment33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional35);
    org.junit.Assert.assertNotNull(path36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(factory38);
  }

  @Test
  public void test1067() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1067");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator4.progressMonitorFactory(
        progressMonitorFactory5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.monitors(monitors7);
    org.neo4j.time.SystemNanoClock systemNanoClock9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.systemNanoClock(
        systemNanoClock9);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.fFileSystemAbstraction(
        fileSystemAbstraction11);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
  }

  @Test
  public void test1068() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1068");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = factory2.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory2.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.databaseNamePattern(
        "database.id");
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions10 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.miAuthMetaOptions(
        authMetaOptions10);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory7.isSicc(
        (java.lang.Boolean) false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(config5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
  }

  @Test
  public void test1069() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1069");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker13 = backupEnvironment12.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern14 = backupEnvironment12.getDatabaseNamePattern();
    boolean boolean15 = backupEnvironment12.getIsBftf();
    java.nio.file.Path path16 = backupEnvironment12.getRpPath();
    org.neo4j.configuration.helpers.SocketAddress socketAddress17 = backupEnvironment12.getSocketAddress();
    org.neo4j.configuration.helpers.SocketAddress socketAddress18 = backupEnvironment12.getSocketAddress();
    java.nio.file.Path path19 = backupEnvironment12.getPbPath();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(memoryTracker13);
    org.junit.Assert.assertNotNull(databaseNamePattern14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(path16);
    org.junit.Assert.assertNotNull(socketAddress17);
    org.junit.Assert.assertNotNull(socketAddress18);
    org.junit.Assert.assertNotNull(path19);
  }

  @Test
  public void test1070() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1070");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup3.isCc(true);
    io.github.onograph.backup.Backup backup7 = backup5.isCc(true);
    io.github.onograph.backup.Backup backup9 = backup5.isCc(true);
    io.github.onograph.backup.Backup backup11 = backup5.isBftf(false);
    io.github.onograph.backup.Backup backup13 = backup11.isBftf(true);
    io.github.onograph.backup.Backup backup15 = backup13.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory20.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory20.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory26.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment32 = factory26.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern33 = backupEnvironment32.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress34 = backupEnvironment32.getSocketAddress();
    java.nio.file.Path path35 = backupEnvironment32.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory17.pbPath(path35);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory40.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory40.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory40.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory46.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory46.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment52 = factory46.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern53 = backupEnvironment52.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress54 = backupEnvironment52.getSocketAddress();
    java.nio.file.Path path55 = backupEnvironment52.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory37.pbPath(path55);
    io.github.onograph.backup.FileMoverService fileMoverService57 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path35, path55);
    java.nio.file.Path path58 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path35);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory59.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory59.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory65 = factory59.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = factory65.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = factory65.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment71 = factory65.bulBackupEnvironment();
    boolean boolean72 = backupEnvironment71.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional73 = backupEnvironment71.geicmaOptional();
    java.nio.file.Path path74 = backupEnvironment71.getPbPath();
    java.nio.file.Path path75 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path74);
    java.nio.file.Path path76 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path75);
    io.github.onograph.backup.BackupEnvironment.Factory factory77 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = factory77.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory77.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory83 = factory77.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory85 = factory83.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory88 = factory83.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment89 = factory83.bulBackupEnvironment();
    boolean boolean90 = backupEnvironment89.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional91 = backupEnvironment89.geicmaOptional();
    java.nio.file.Path path92 = backupEnvironment89.getPbPath();
    java.nio.file.Path path93 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path92);
    io.github.onograph.backup.FileMoverService fileMoverService94 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path75, path93);
    io.github.onograph.backup.FileMoverService fileMoverService95 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path35, path93);
    try {
      io.github.onograph.backup.Backup.BackupRespState backupRespState96 = backup13.bakBackupBackupRespState(
          "", path93);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.RuntimeException; message: *** Error:  3b02b00a-232a-454b-823b-025cc97a58b8");
    } catch (java.lang.RuntimeException e) {
    }
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
    org.junit.Assert.assertNotNull(backup11);
    org.junit.Assert.assertNotNull(backup13);
    org.junit.Assert.assertNotNull(backup15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(backupEnvironment32);
    org.junit.Assert.assertNotNull(databaseNamePattern33);
    org.junit.Assert.assertNotNull(socketAddress34);
    org.junit.Assert.assertNotNull(path35);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(backupEnvironment52);
    org.junit.Assert.assertNotNull(databaseNamePattern53);
    org.junit.Assert.assertNotNull(socketAddress54);
    org.junit.Assert.assertNotNull(path55);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(fileMoverService57);
    org.junit.Assert.assertNotNull(path58);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory65);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(factory70);
    org.junit.Assert.assertNotNull(backupEnvironment71);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional73);
    org.junit.Assert.assertNotNull(path74);
    org.junit.Assert.assertNotNull(path75);
    org.junit.Assert.assertNotNull(path76);
    org.junit.Assert.assertNotNull(factory77);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(factory83);
    org.junit.Assert.assertNotNull(factory85);
    org.junit.Assert.assertNotNull(factory88);
    org.junit.Assert.assertNotNull(backupEnvironment89);
    org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional91);
    org.junit.Assert.assertNotNull(path92);
    org.junit.Assert.assertNotNull(path93);
    org.junit.Assert.assertNotNull(fileMoverService94);
    org.junit.Assert.assertNotNull(fileMoverService95);
  }

  @Test
  public void test1071() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1071");
    }
    io.github.onograph.backup.Backup backup2 = io.github.onograph.backup.Backup.froBackup(100,
        "hi!");
    org.junit.Assert.assertNotNull(backup2);
  }

  @Test
  public void test1072() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1072");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.systemNanoClock(
        systemNanoClock7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.itraLogProvider(
        logProvider9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.monitors(monitors11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.monitors(monitors13);
    org.neo4j.monitoring.Monitors monitors15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator12.monitors(monitors15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    io.github.onograph.backup.BackupRunner.Generator generator18 = generator12.uLogProvider(
        logProvider17);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory19 = null;
    io.github.onograph.backup.BackupRunner.Generator generator20 = generator12.progressMonitorFactory(
        progressMonitorFactory19);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
    org.junit.Assert.assertNotNull(generator18);
    org.junit.Assert.assertNotNull(generator20);
  }

  @Test
  public void test1073() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1073");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.systemNanoClock(
        systemNanoClock7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.itraLogProvider(
        logProvider9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.uLogProvider(
        logProvider11);
    org.neo4j.time.SystemNanoClock systemNanoClock13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator10.systemNanoClock(
        systemNanoClock13);
    org.neo4j.monitoring.Monitors monitors15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator10.monitors(monitors15);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
  }

  @Test
  public void test1074() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1074");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory4.wihadsBackupEnvironmentFactory(
        (int) (short) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory4.wihadsBackupEnvironmentFactory(
        0, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory4.isCc(true);
    org.neo4j.configuration.Config config19 = factory18.gecfConfig();
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions20 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory18.miAuthMetaOptions(
        authMetaOptions20);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory22.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory22.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory22.isSicc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern29 = factory28.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory18.databaseNamePattern(
        databaseNamePattern29);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory18.isIcc(
        (java.lang.Boolean) false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(config19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(databaseNamePattern29);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
  }

  @Test
  public void test1075() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1075");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    org.neo4j.configuration.helpers.SocketAddress socketAddress3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.wihadsBackupEnvironmentFactory(
        socketAddress3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.isCc(false);
    io.github.onograph.backup.BackupEnvironment backupEnvironment11 = factory4.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker12 = backupEnvironment11.getMemoryTracker();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(backupEnvironment11);
    org.junit.Assert.assertNotNull(memoryTracker12);
  }

  @Test
  public void test1076() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1076");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupMetadataRepository backupMetadataRepository1 = new io.github.onograph.backup.BackupMetadataRepository(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory5.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory5.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory5.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory11.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment17 = factory11.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern18 = backupEnvironment17.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress19 = backupEnvironment17.getSocketAddress();
    java.nio.file.Path path20 = backupEnvironment17.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory2.pbPath(path20);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory22.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory25.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory25.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory31.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory31.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment37 = factory31.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern38 = backupEnvironment37.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress39 = backupEnvironment37.getSocketAddress();
    java.nio.file.Path path40 = backupEnvironment37.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory22.pbPath(path40);
    io.github.onograph.backup.FileMoverService fileMoverService42 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path20, path40);
    java.nio.file.Path path43 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path40);
    java.lang.String[] strArray46 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
    boolean boolean48 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList47, strArray46);
    try {
      backupMetadataRepository1.wrtForPaLi(path40, (java.util.List<java.lang.String>) strList47);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(backupEnvironment17);
    org.junit.Assert.assertNotNull(databaseNamePattern18);
    org.junit.Assert.assertNotNull(socketAddress19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(backupEnvironment37);
    org.junit.Assert.assertNotNull(databaseNamePattern38);
    org.junit.Assert.assertNotNull(socketAddress39);
    org.junit.Assert.assertNotNull(path40);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(fileMoverService42);
    org.junit.Assert.assertNotNull(path43);
    org.junit.Assert.assertNotNull(strArray46);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
  }

  @Test
  public void test1077() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1077");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isFtfb(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isRp(true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
  }

  @Test
  public void test1078() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1078");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.systemNanoClock(
        systemNanoClock7);
    org.neo4j.monitoring.Monitors monitors9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.monitors(monitors9);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator6.progressMonitorFactory(
        progressMonitorFactory11);
    org.neo4j.time.SystemNanoClock systemNanoClock13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.systemNanoClock(
        systemNanoClock13);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
  }

  @Test
  public void test1079() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1079");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.GdbIdRepo gdbIdRepo1 = new io.github.onograph.backup.GdbIdRepo(
        fileSystemAbstraction0);
    org.neo4j.kernel.database.DatabaseId databaseId2 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory3 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = factory3.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory6.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory6.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory12.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment18 = factory12.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern19 = backupEnvironment18.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress20 = backupEnvironment18.getSocketAddress();
    java.nio.file.Path path21 = backupEnvironment18.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory3.pbPath(path21);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory26.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory26.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory32.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment38 = factory32.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern39 = backupEnvironment38.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress40 = backupEnvironment38.getSocketAddress();
    java.nio.file.Path path41 = backupEnvironment38.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory23.pbPath(path41);
    io.github.onograph.backup.FileMoverService fileMoverService43 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path21, path41);
    java.nio.file.Path path44 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path41);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config46 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory45.config(config46);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory47.isRp(true);
    org.neo4j.configuration.Config config50 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory49.config(config50);
    org.neo4j.configuration.helpers.SocketAddress socketAddress52 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory49.wihadsBackupEnvironmentFactory(
        socketAddress52);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory54.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory57.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory57.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory57.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory65 = factory63.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory68 = factory63.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment69 = factory63.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern70 = backupEnvironment69.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress71 = backupEnvironment69.getSocketAddress();
    java.nio.file.Path path72 = backupEnvironment69.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory73 = factory54.pbPath(path72);
    io.github.onograph.backup.BackupEnvironment.Factory factory74 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory76 = factory74.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory77 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = factory77.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory77.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory83 = factory77.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory85 = factory83.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory88 = factory83.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment89 = factory83.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern90 = backupEnvironment89.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress91 = backupEnvironment89.getSocketAddress();
    java.nio.file.Path path92 = backupEnvironment89.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory93 = factory74.pbPath(path92);
    io.github.onograph.backup.FileMoverService fileMoverService94 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path72, path92);
    io.github.onograph.backup.BackupEnvironment.Factory factory95 = factory49.pbPath(path92);
    io.github.onograph.backup.FileMoverService fileMoverService96 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path41, path92);
    try {
      gdbIdRepo1.wrdaiForDaPa(databaseId2, path92);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory3);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(backupEnvironment18);
    org.junit.Assert.assertNotNull(databaseNamePattern19);
    org.junit.Assert.assertNotNull(socketAddress20);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(backupEnvironment38);
    org.junit.Assert.assertNotNull(databaseNamePattern39);
    org.junit.Assert.assertNotNull(socketAddress40);
    org.junit.Assert.assertNotNull(path41);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(fileMoverService43);
    org.junit.Assert.assertNotNull(path44);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory65);
    org.junit.Assert.assertNotNull(factory68);
    org.junit.Assert.assertNotNull(backupEnvironment69);
    org.junit.Assert.assertNotNull(databaseNamePattern70);
    org.junit.Assert.assertNotNull(socketAddress71);
    org.junit.Assert.assertNotNull(path72);
    org.junit.Assert.assertNotNull(factory73);
    org.junit.Assert.assertNotNull(factory74);
    org.junit.Assert.assertNotNull(factory76);
    org.junit.Assert.assertNotNull(factory77);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(factory83);
    org.junit.Assert.assertNotNull(factory85);
    org.junit.Assert.assertNotNull(factory88);
    org.junit.Assert.assertNotNull(backupEnvironment89);
    org.junit.Assert.assertNotNull(databaseNamePattern90);
    org.junit.Assert.assertNotNull(socketAddress91);
    org.junit.Assert.assertNotNull(path92);
    org.junit.Assert.assertNotNull(factory93);
    org.junit.Assert.assertNotNull(fileMoverService94);
    org.junit.Assert.assertNotNull(factory95);
    org.junit.Assert.assertNotNull(fileMoverService96);
  }

  @Test
  public void test1080() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1080");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory4.wihadsBackupEnvironmentFactory(
        (int) (short) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.isIcc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.Config config19 = factory18.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory4.config(config19);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.shouldPrep(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory23.isRp(false);
    java.nio.file.Path path28 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.prPath(path28);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory29.isFtfb(true);
    org.neo4j.configuration.helpers.SocketAddress socketAddress32 = factory31.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory31.wihadsBackupEnvironmentFactory(
        (-1), "");
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory35.isFtfb(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory41.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory41.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory41.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory47.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory47.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment53 = factory47.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern54 = backupEnvironment53.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress55 = backupEnvironment53.getSocketAddress();
    java.nio.file.Path path56 = backupEnvironment53.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory38.pbPath(path56);
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory38.wihadsBackupEnvironmentFactory(
        100, "database.id");
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern61 = factory60.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory37.databaseNamePattern(
        databaseNamePattern61);
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory20.databaseNamePattern(
        databaseNamePattern61);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(config19);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNull(socketAddress32);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(backupEnvironment53);
    org.junit.Assert.assertNotNull(databaseNamePattern54);
    org.junit.Assert.assertNotNull(socketAddress55);
    org.junit.Assert.assertNotNull(path56);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(databaseNamePattern61);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(factory63);
  }

  @Test
  public void test1081() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1081");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.miAuthMetaOptions(
        authMetaOptions7);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory10.wihadsBackupEnvironmentFactory(
        (int) (byte) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory14.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory14.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory20.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment26 = factory20.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker27 = backupEnvironment26.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern28 = backupEnvironment26.getDatabaseNamePattern();
    boolean boolean29 = backupEnvironment26.getIsBftf();
    org.neo4j.configuration.helpers.SocketAddress socketAddress30 = backupEnvironment26.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory13.wihadsBackupEnvironmentFactory(
        socketAddress30);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory13.isSicc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config35 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory34.config(config35);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory36.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory36.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory36.isFtfb(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory43.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory43.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory43.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory49.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory49.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment55 = factory49.bulBackupEnvironment();
    boolean boolean56 = backupEnvironment55.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional57 = backupEnvironment55.geicmaOptional();
    org.neo4j.configuration.helpers.SocketAddress socketAddress58 = backupEnvironment55.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory36.wihadsBackupEnvironmentFactory(
        socketAddress58);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern60 = factory59.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory13.databaseNamePattern(
        databaseNamePattern60);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(backupEnvironment26);
    org.junit.Assert.assertNotNull(memoryTracker27);
    org.junit.Assert.assertNotNull(databaseNamePattern28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertNotNull(socketAddress30);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(backupEnvironment55);
    org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional57);
    org.junit.Assert.assertNotNull(socketAddress58);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(databaseNamePattern60);
    org.junit.Assert.assertNotNull(factory61);
  }

  @Test
  public void test1082() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1082");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup3.isCc(true);
    io.github.onograph.backup.Backup backup7 = backup5.isCc(true);
    io.github.onograph.backup.Backup backup9 = backup5.isCc(true);
    io.github.onograph.backup.Backup backup11 = backup5.isBftf(false);
    io.github.onograph.backup.Backup backup13 = backup11.isBftf(true);
    io.github.onograph.backup.Backup backup15 = backup13.isCc(false);
    io.github.onograph.backup.Backup backup17 = backup13.isBftf(true);
    io.github.onograph.backup.Backup backup19 = backup13.isCc(false);
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
    org.junit.Assert.assertNotNull(backup11);
    org.junit.Assert.assertNotNull(backup13);
    org.junit.Assert.assertNotNull(backup15);
    org.junit.Assert.assertNotNull(backup17);
    org.junit.Assert.assertNotNull(backup19);
  }

  @Test
  public void test1083() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1083");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory3 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = factory3.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory3.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory3.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory9.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment15 = factory9.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern16 = backupEnvironment15.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress17 = backupEnvironment15.getSocketAddress();
    java.nio.file.Path path18 = backupEnvironment15.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory0.pbPath(path18);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory23.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory23.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory29.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory29.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment35 = factory29.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern36 = backupEnvironment35.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress37 = backupEnvironment35.getSocketAddress();
    java.nio.file.Path path38 = backupEnvironment35.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory20.pbPath(path38);
    io.github.onograph.backup.FileMoverService fileMoverService40 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path18, path38);
    java.nio.file.Path path41 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path38);
    boolean boolean42 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path38);
    boolean boolean43 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path38);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory3);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(backupEnvironment15);
    org.junit.Assert.assertNotNull(databaseNamePattern16);
    org.junit.Assert.assertNotNull(socketAddress17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(backupEnvironment35);
    org.junit.Assert.assertNotNull(databaseNamePattern36);
    org.junit.Assert.assertNotNull(socketAddress37);
    org.junit.Assert.assertNotNull(path38);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(fileMoverService40);
    org.junit.Assert.assertNotNull(path41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
  }

  @Test
  public void test1084() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1084");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    org.neo4j.configuration.helpers.SocketAddress socketAddress3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.wihadsBackupEnvironmentFactory(
        socketAddress3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.shouldPrep(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory4.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isCc(false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
  }

  @Test
  public void test1085() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1085");
    }
    io.github.onograph.backup.CommandProviderGdbRestorerCommandImpl commandProviderGdbRestorerCommandImpl0 = new io.github.onograph.backup.CommandProviderGdbRestorerCommandImpl();
    org.neo4j.cli.Command.CommandType commandType1 = commandProviderGdbRestorerCommandImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType2 = commandProviderGdbRestorerCommandImpl0.commandType();
    int int3 = commandProviderGdbRestorerCommandImpl0.getPriority();
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.RESTORE_DB + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.RESTORE_DB));
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.RESTORE_DB + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.RESTORE_DB));
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
  }

  @Test
  public void test1086() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1086");
    }
    io.github.onograph.backup.SetupForBackupRestorationCommandProvider setupForBackupRestorationCommandProvider0 = new io.github.onograph.backup.SetupForBackupRestorationCommandProvider();
    int int1 = setupForBackupRestorationCommandProvider0.getPriority();
    int int2 = setupForBackupRestorationCommandProvider0.getPriority();
    int int3 = setupForBackupRestorationCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType4 = setupForBackupRestorationCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType5 = setupForBackupRestorationCommandProvider0.commandType();
    org.neo4j.cli.Command.CommandType commandType6 = setupForBackupRestorationCommandProvider0.commandType();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.PREPARE_RESTORE + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.PREPARE_RESTORE));
    org.junit.Assert.assertTrue(
        "'" + commandType5 + "' != '" + org.neo4j.cli.Command.CommandType.PREPARE_RESTORE + "'",
        commandType5.equals(org.neo4j.cli.Command.CommandType.PREPARE_RESTORE));
    org.junit.Assert.assertTrue(
        "'" + commandType6 + "' != '" + org.neo4j.cli.Command.CommandType.PREPARE_RESTORE + "'",
        commandType6.equals(org.neo4j.cli.Command.CommandType.PREPARE_RESTORE));
  }

  @Test
  public void test1087() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1087");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    java.nio.file.Path path3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.prPath(path3);
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config6 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory5.config(config6);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isRp(true);
    org.neo4j.configuration.Config config10 = factory7.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory0.config(config10);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory0.shouldPrep(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isIcc(
        (java.lang.Boolean) true);
    java.nio.file.Path path16 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory13.prPath(path16);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(config10);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
  }

  @Test
  public void test1088() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1088");
    }
    io.github.onograph.backup.SetupForBackupRestorationCommandProvider setupForBackupRestorationCommandProvider0 = new io.github.onograph.backup.SetupForBackupRestorationCommandProvider();
    int int1 = setupForBackupRestorationCommandProvider0.getPriority();
    int int2 = setupForBackupRestorationCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType3 = setupForBackupRestorationCommandProvider0.commandType();
    int int4 = setupForBackupRestorationCommandProvider0.getPriority();
    org.neo4j.cli.Command.CommandType commandType5 = setupForBackupRestorationCommandProvider0.commandType();
    org.neo4j.cli.ExecutionContext executionContext6 = null;
    try {
      io.github.onograph.backup.SetupForBackupRestorationCommand setupForBackupRestorationCommand7 = setupForBackupRestorationCommandProvider0.createCommand(
          executionContext6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.PREPARE_RESTORE + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.PREPARE_RESTORE));
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType5 + "' != '" + org.neo4j.cli.Command.CommandType.PREPARE_RESTORE + "'",
        commandType5.equals(org.neo4j.cli.Command.CommandType.PREPARE_RESTORE));
  }

  @Test
  public void test1089() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1089");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    java.nio.file.Path path3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.prPath(path3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory7.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory13.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment19 = factory13.bulBackupEnvironment();
    boolean boolean20 = backupEnvironment19.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional21 = backupEnvironment19.geicmaOptional();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern22 = backupEnvironment19.getDatabaseNamePattern();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional23 = backupEnvironment19.geicmaOptional();
    org.neo4j.memory.MemoryTracker memoryTracker24 = backupEnvironment19.getMemoryTracker();
    org.neo4j.configuration.helpers.SocketAddress socketAddress25 = backupEnvironment19.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory6.wihadsBackupEnvironmentFactory(
        socketAddress25);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory6.isGcc(
        (java.lang.Boolean) false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(backupEnvironment19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional21);
    org.junit.Assert.assertNotNull(databaseNamePattern22);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional23);
    org.junit.Assert.assertNotNull(memoryTracker24);
    org.junit.Assert.assertNotNull(socketAddress25);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
  }

  @Test
  public void test1090() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1090");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    java.nio.file.Path path3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.prPath(path3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment backupEnvironment7 = factory0.bulBackupEnvironment();
    java.nio.file.Path path8 = backupEnvironment7.getPbPath();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(backupEnvironment7);
    org.junit.Assert.assertNotNull(path8);
  }

  @Test
  public void test1091() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1091");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory8.shouldPrep(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.shouldPrep(true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
  }

  @Test
  public void test1092() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1092");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory0.isSicc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config10 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.config(config10);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isRp(true);
    org.neo4j.configuration.Config config14 = factory11.gecfConfig();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction15 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.isCc(false);
    java.nio.file.Path path19 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory16.prPath(path19);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory16.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory23.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory28.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory28.isRp(false);
    java.nio.file.Path path33 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.prPath(path33);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern35 = factory34.gedtenprDatabaseNamePattern();
    org.neo4j.configuration.Config config36 = factory34.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory27.config(config36);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory16.config(config36);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction39 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory40.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory40.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory40.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory46.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory46.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment52 = factory46.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker53 = backupEnvironment52.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern54 = backupEnvironment52.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress55 = backupEnvironment52.getSocketAddress();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern56 = backupEnvironment52.getDatabaseNamePattern();
    org.neo4j.memory.MemoryTracker memoryTracker57 = backupEnvironment52.getMemoryTracker();
    org.neo4j.io.pagecache.PageCache pageCache58 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager59 = new io.github.onograph.backup.BackupRestorationManager(
        config36, fileSystemAbstraction39, memoryTracker57, pageCache58);
    org.neo4j.io.pagecache.PageCache pageCache60 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager61 = new io.github.onograph.backup.BackupRestorationManager(
        config14, fileSystemAbstraction15, memoryTracker57, pageCache60);
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory8.config(config14);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(config14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(databaseNamePattern35);
    org.junit.Assert.assertNotNull(config36);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(backupEnvironment52);
    org.junit.Assert.assertNotNull(memoryTracker53);
    org.junit.Assert.assertNotNull(databaseNamePattern54);
    org.junit.Assert.assertNotNull(socketAddress55);
    org.junit.Assert.assertNotNull(databaseNamePattern56);
    org.junit.Assert.assertNotNull(memoryTracker57);
    org.junit.Assert.assertNotNull(factory62);
  }

  @Test
  public void test1093() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1093");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.GdbIdRepo gdbIdRepo1 = new io.github.onograph.backup.GdbIdRepo(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    java.nio.file.Path path9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory2.pbPath(path9);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory11.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory11.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory17.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment23 = factory17.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern24 = backupEnvironment23.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress25 = backupEnvironment23.getSocketAddress();
    java.nio.file.Path path26 = backupEnvironment23.getRpPath();
    boolean boolean27 = backupEnvironment23.getIsBftf();
    java.nio.file.Path path28 = backupEnvironment23.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory10.prPath(path28);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory30.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory30.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory30.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory36.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory36.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment42 = factory36.bulBackupEnvironment();
    boolean boolean43 = backupEnvironment42.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional44 = backupEnvironment42.geicmaOptional();
    java.nio.file.Path path45 = backupEnvironment42.getPbPath();
    java.nio.file.Path path46 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path45);
    java.nio.file.Path path47 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path46);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory48.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory48.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory48.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory54.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory54.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment60 = factory54.bulBackupEnvironment();
    boolean boolean61 = backupEnvironment60.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional62 = backupEnvironment60.geicmaOptional();
    java.nio.file.Path path63 = backupEnvironment60.getPbPath();
    java.nio.file.Path path64 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path63);
    io.github.onograph.backup.FileMoverService fileMoverService65 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path46, path64);
    java.nio.file.Path path66 = fileMoverService65.filPath();
    io.github.onograph.backup.FileMoverService fileMoverService67 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path28, path66);
    try {
      java.util.Optional<org.neo4j.kernel.database.DatabaseId> databaseIdOptional68 = gdbIdRepo1.reddtaiOptional(
          path66);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(backupEnvironment23);
    org.junit.Assert.assertNotNull(databaseNamePattern24);
    org.junit.Assert.assertNotNull(socketAddress25);
    org.junit.Assert.assertNotNull(path26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertNotNull(path28);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(backupEnvironment42);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional44);
    org.junit.Assert.assertNotNull(path45);
    org.junit.Assert.assertNotNull(path46);
    org.junit.Assert.assertNotNull(path47);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(backupEnvironment60);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional62);
    org.junit.Assert.assertNotNull(path63);
    org.junit.Assert.assertNotNull(path64);
    org.junit.Assert.assertNotNull(fileMoverService65);
    org.junit.Assert.assertNotNull(path66);
    org.junit.Assert.assertNotNull(fileMoverService67);
  }

  @Test
  public void test1094() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1094");
    }
    io.github.onograph.backup.CommandProviderGdbRestorerCommandImpl commandProviderGdbRestorerCommandImpl0 = new io.github.onograph.backup.CommandProviderGdbRestorerCommandImpl();
    int int1 = commandProviderGdbRestorerCommandImpl0.getPriority();
    org.neo4j.cli.Command.CommandType commandType2 = commandProviderGdbRestorerCommandImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = commandProviderGdbRestorerCommandImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType4 = commandProviderGdbRestorerCommandImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType5 = commandProviderGdbRestorerCommandImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType6 = commandProviderGdbRestorerCommandImpl0.commandType();
    int int7 = commandProviderGdbRestorerCommandImpl0.getPriority();
    int int8 = commandProviderGdbRestorerCommandImpl0.getPriority();
    org.neo4j.cli.Command.CommandType commandType9 = commandProviderGdbRestorerCommandImpl0.commandType();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.RESTORE_DB + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.RESTORE_DB));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.RESTORE_DB + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.RESTORE_DB));
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.RESTORE_DB + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.RESTORE_DB));
    org.junit.Assert.assertTrue(
        "'" + commandType5 + "' != '" + org.neo4j.cli.Command.CommandType.RESTORE_DB + "'",
        commandType5.equals(org.neo4j.cli.Command.CommandType.RESTORE_DB));
    org.junit.Assert.assertTrue(
        "'" + commandType6 + "' != '" + org.neo4j.cli.Command.CommandType.RESTORE_DB + "'",
        commandType6.equals(org.neo4j.cli.Command.CommandType.RESTORE_DB));
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType9 + "' != '" + org.neo4j.cli.Command.CommandType.RESTORE_DB + "'",
        commandType9.equals(org.neo4j.cli.Command.CommandType.RESTORE_DB));
  }

  @Test
  public void test1095() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1095");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupMetadataRepository backupMetadataRepository1 = new io.github.onograph.backup.BackupMetadataRepository(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.prPath(path5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isSicc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory11.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory11.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory17.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment23 = factory17.bulBackupEnvironment();
    boolean boolean24 = backupEnvironment23.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional25 = backupEnvironment23.geicmaOptional();
    java.nio.file.Path path26 = backupEnvironment23.getPbPath();
    java.nio.file.Path path27 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path26);
    java.nio.file.Path path28 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path27);
    boolean boolean29 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path28);
    java.nio.file.Path path30 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path28);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory31.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory31.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory31.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory37.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment43 = factory37.bulBackupEnvironment();
    boolean boolean44 = backupEnvironment43.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional45 = backupEnvironment43.geicmaOptional();
    java.nio.file.Path path46 = backupEnvironment43.getPbPath();
    java.nio.file.Path path47 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path46);
    java.nio.file.Path path48 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path47);
    io.github.onograph.backup.FileMoverService fileMoverService49 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path28, path47);
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory10.prPath(path47);
    java.nio.file.Path path51 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path47);
    java.nio.file.Path path52 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path47);
    java.nio.file.Path path53 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path47);
    java.nio.file.Path path54 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path47);
    java.lang.String[] strArray56 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
    boolean boolean58 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList57, strArray56);
    try {
      backupMetadataRepository1.wrtForPaLi(path47, (java.util.List<java.lang.String>) strList57);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(backupEnvironment23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional25);
    org.junit.Assert.assertNotNull(path26);
    org.junit.Assert.assertNotNull(path27);
    org.junit.Assert.assertNotNull(path28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(path30);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(backupEnvironment43);
    org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional45);
    org.junit.Assert.assertNotNull(path46);
    org.junit.Assert.assertNotNull(path47);
    org.junit.Assert.assertNotNull(path48);
    org.junit.Assert.assertNotNull(fileMoverService49);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(path51);
    org.junit.Assert.assertNotNull(path52);
    org.junit.Assert.assertNotNull(path53);
    org.junit.Assert.assertNotNull(path54);
    org.junit.Assert.assertNotNull(strArray56);
    org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
  }

  @Test
  public void test1096() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1096");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.prPath(path5);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern7 = factory6.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory6.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config11 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.config(config11);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isRp(true);
    org.neo4j.configuration.Config config15 = factory12.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory12.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory18.isCc(false);
    java.nio.file.Path path21 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory18.prPath(path21);
    org.neo4j.configuration.helpers.SocketAddress socketAddress23 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory22.wihadsBackupEnvironmentFactory(
        socketAddress23);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config26 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.config(config26);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isRp(true);
    org.neo4j.configuration.Config config30 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory29.config(config30);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory29.databaseNamePattern(
        "database.id");
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory34.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions37 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory34.miAuthMetaOptions(
        authMetaOptions37);
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory40.isIcc(
        (java.lang.Boolean) false);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern43 = factory40.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory29.databaseNamePattern(
        databaseNamePattern43);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory22.databaseNamePattern(
        databaseNamePattern43);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory17.databaseNamePattern(
        databaseNamePattern43);
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory9.databaseNamePattern(
        databaseNamePattern43);
    org.neo4j.configuration.helpers.SocketAddress socketAddress48 = factory9.getSocketAddress();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(databaseNamePattern7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(config15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(databaseNamePattern43);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNull(socketAddress48);
  }

  @Test
  public void test1097() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1097");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern13 = backupEnvironment12.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress14 = backupEnvironment12.getSocketAddress();
    java.nio.file.Path path15 = backupEnvironment12.getRpPath();
    boolean boolean16 = backupEnvironment12.getIsBftf();
    java.nio.file.Path path17 = backupEnvironment12.getRpPath();
    org.neo4j.memory.MemoryTracker memoryTracker18 = backupEnvironment12.getMemoryTracker();
    java.nio.file.Path path19 = backupEnvironment12.getRpPath();
    java.nio.file.Path path20 = backupEnvironment12.getRpPath();
    java.nio.file.Path path21 = backupEnvironment12.getRpPath();
    java.nio.file.Path path22 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path21);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(databaseNamePattern13);
    org.junit.Assert.assertNotNull(socketAddress14);
    org.junit.Assert.assertNotNull(path15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(memoryTracker18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertNotNull(path22);
  }

  @Test
  public void test1098() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1098");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory6.shouldPrep(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions16 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory13.miAuthMetaOptions(
        authMetaOptions16);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory19.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory24.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory24.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory30.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory30.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment36 = factory30.bulBackupEnvironment();
    boolean boolean37 = backupEnvironment36.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional38 = backupEnvironment36.geicmaOptional();
    java.nio.file.Path path39 = backupEnvironment36.getPbPath();
    java.nio.file.Path path40 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path39);
    java.nio.file.Path path41 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path40);
    boolean boolean42 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path41);
    java.nio.file.Path path43 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path41);
    java.nio.file.Path path44 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path43);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory19.pbPath(path43);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory12.pbPath(path43);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(backupEnvironment36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional38);
    org.junit.Assert.assertNotNull(path39);
    org.junit.Assert.assertNotNull(path40);
    org.junit.Assert.assertNotNull(path41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertNotNull(path43);
    org.junit.Assert.assertNotNull(path44);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory46);
  }

  @Test
  public void test1099() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1099");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup3.isCc(true);
    io.github.onograph.backup.Backup backup7 = backup5.isCc(true);
    io.github.onograph.backup.Backup backup9 = backup5.isCc(true);
    io.github.onograph.backup.Backup backup11 = backup5.isBftf(false);
    io.github.onograph.backup.Backup backup13 = backup11.isBftf(true);
    io.github.onograph.backup.Backup backup15 = backup13.isCc(false);
    io.github.onograph.backup.Backup backup17 = backup13.isBftf(true);
    java.io.OutputStream outputStream18 = null;
    try {
      io.github.onograph.backup.Backup backup19 = backup13.outputStream(outputStream18);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: outputStream");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
    org.junit.Assert.assertNotNull(backup11);
    org.junit.Assert.assertNotNull(backup13);
    org.junit.Assert.assertNotNull(backup15);
    org.junit.Assert.assertNotNull(backup17);
  }

  @Test
  public void test1100() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1100");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.monitoring.Monitors monitors3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.monitors(monitors3);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.fFileSystemAbstraction(
        fileSystemAbstraction5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator2.systemNanoClock(
        systemNanoClock7);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
  }

  @Test
  public void test1101() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1101");
    }
    io.github.onograph.backup.CommandProviderBackupImpl commandProviderBackupImpl0 = new io.github.onograph.backup.CommandProviderBackupImpl();
    org.neo4j.cli.Command.CommandType commandType1 = commandProviderBackupImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType2 = commandProviderBackupImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType3 = commandProviderBackupImpl0.commandType();
    int int4 = commandProviderBackupImpl0.getPriority();
    int int5 = commandProviderBackupImpl0.getPriority();
    org.junit.Assert.assertTrue(
        "'" + commandType1 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType1.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue(
        "'" + commandType2 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType2.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
  }

  @Test
  public void test1102() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1102");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory7.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory13.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment19 = factory13.bulBackupEnvironment();
    boolean boolean20 = backupEnvironment19.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional21 = backupEnvironment19.geicmaOptional();
    java.nio.file.Path path22 = backupEnvironment19.getPbPath();
    java.nio.file.Path path23 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path22);
    java.nio.file.Path path24 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path23);
    boolean boolean25 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path24);
    java.nio.file.Path path26 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path24);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory27.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory27.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory33.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory33.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment39 = factory33.bulBackupEnvironment();
    boolean boolean40 = backupEnvironment39.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional41 = backupEnvironment39.geicmaOptional();
    java.nio.file.Path path42 = backupEnvironment39.getPbPath();
    java.nio.file.Path path43 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path42);
    java.nio.file.Path path44 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path43);
    io.github.onograph.backup.FileMoverService fileMoverService45 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path24, path43);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory4.prPath(path43);
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory47.isCc(false);
    java.nio.file.Path path50 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory47.prPath(path50);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory51.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config55 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory54.config(config55);
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = factory56.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory56.isSicc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern61 = factory56.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory53.databaseNamePattern(
        databaseNamePattern61);
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory46.databaseNamePattern(
        databaseNamePattern61);
    io.github.onograph.backup.BackupEnvironment.Factory factory64 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config65 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory66 = factory64.config(config65);
    io.github.onograph.backup.BackupEnvironment.Factory factory68 = factory66.isRp(true);
    org.neo4j.configuration.Config config69 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = factory68.config(config69);
    io.github.onograph.backup.BackupEnvironment.Factory factory72 = factory68.databaseNamePattern(
        "database.id");
    io.github.onograph.backup.BackupEnvironment.Factory factory73 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory75 = factory73.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions76 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory77 = factory73.miAuthMetaOptions(
        authMetaOptions76);
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = factory77.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory79.isIcc(
        (java.lang.Boolean) false);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern82 = factory79.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory83 = factory68.databaseNamePattern(
        databaseNamePattern82);
    io.github.onograph.backup.BackupEnvironment.Factory factory84 = factory46.databaseNamePattern(
        databaseNamePattern82);
    io.github.onograph.backup.BackupEnvironment.Factory factory86 = factory84.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory88 = factory84.isFtfb(false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(backupEnvironment19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional21);
    org.junit.Assert.assertNotNull(path22);
    org.junit.Assert.assertNotNull(path23);
    org.junit.Assert.assertNotNull(path24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(path26);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(backupEnvironment39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional41);
    org.junit.Assert.assertNotNull(path42);
    org.junit.Assert.assertNotNull(path43);
    org.junit.Assert.assertNotNull(path44);
    org.junit.Assert.assertNotNull(fileMoverService45);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(databaseNamePattern61);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory64);
    org.junit.Assert.assertNotNull(factory66);
    org.junit.Assert.assertNotNull(factory68);
    org.junit.Assert.assertNotNull(factory70);
    org.junit.Assert.assertNotNull(factory72);
    org.junit.Assert.assertNotNull(factory73);
    org.junit.Assert.assertNotNull(factory75);
    org.junit.Assert.assertNotNull(factory77);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(databaseNamePattern82);
    org.junit.Assert.assertNotNull(factory83);
    org.junit.Assert.assertNotNull(factory84);
    org.junit.Assert.assertNotNull(factory86);
    org.junit.Assert.assertNotNull(factory88);
  }

  @Test
  public void test1103() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1103");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory3 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = factory3.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory3.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory3.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory9.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment15 = factory9.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern16 = backupEnvironment15.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress17 = backupEnvironment15.getSocketAddress();
    java.nio.file.Path path18 = backupEnvironment15.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory0.pbPath(path18);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions20 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory0.miAuthMetaOptions(
        authMetaOptions20);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.shouldPrep(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory21.isIcc(
        (java.lang.Boolean) false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory3);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(backupEnvironment15);
    org.junit.Assert.assertNotNull(databaseNamePattern16);
    org.junit.Assert.assertNotNull(socketAddress17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
  }

  @Test
  public void test1104() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1104");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.prPath(path5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isFtfb(true);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions11 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory8.miAuthMetaOptions(
        authMetaOptions11);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config17 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.config(config17);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory18.isRp(true);
    org.neo4j.configuration.Config config21 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.config(config21);
    org.neo4j.configuration.helpers.SocketAddress socketAddress23 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory20.wihadsBackupEnvironmentFactory(
        socketAddress23);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory28.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory28.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory28.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory34.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory34.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment40 = factory34.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern41 = backupEnvironment40.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress42 = backupEnvironment40.getSocketAddress();
    java.nio.file.Path path43 = backupEnvironment40.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory25.pbPath(path43);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory45.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory48.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory48.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory48.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory54.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory54.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment60 = factory54.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern61 = backupEnvironment60.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress62 = backupEnvironment60.getSocketAddress();
    java.nio.file.Path path63 = backupEnvironment60.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory64 = factory45.pbPath(path63);
    io.github.onograph.backup.FileMoverService fileMoverService65 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path43, path63);
    io.github.onograph.backup.BackupEnvironment.Factory factory66 = factory20.pbPath(path63);
    boolean boolean67 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path63);
    io.github.onograph.backup.BackupEnvironment.Factory factory68 = factory13.prPath(path63);
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = factory13.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory71 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory73 = factory71.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions74 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory75 = factory71.miAuthMetaOptions(
        authMetaOptions74);
    io.github.onograph.backup.BackupEnvironment.Factory factory77 = factory75.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = factory75.isCc(true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern80 = factory79.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory13.databaseNamePattern(
        databaseNamePattern80);
    io.github.onograph.backup.BackupEnvironment.Factory factory82 = factory12.databaseNamePattern(
        databaseNamePattern80);
    io.github.onograph.backup.BackupEnvironment.Factory factory84 = factory12.isSicc(
        (java.lang.Boolean) true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(backupEnvironment40);
    org.junit.Assert.assertNotNull(databaseNamePattern41);
    org.junit.Assert.assertNotNull(socketAddress42);
    org.junit.Assert.assertNotNull(path43);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(backupEnvironment60);
    org.junit.Assert.assertNotNull(databaseNamePattern61);
    org.junit.Assert.assertNotNull(socketAddress62);
    org.junit.Assert.assertNotNull(path63);
    org.junit.Assert.assertNotNull(factory64);
    org.junit.Assert.assertNotNull(fileMoverService65);
    org.junit.Assert.assertNotNull(factory66);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    org.junit.Assert.assertNotNull(factory68);
    org.junit.Assert.assertNotNull(factory70);
    org.junit.Assert.assertNotNull(factory71);
    org.junit.Assert.assertNotNull(factory73);
    org.junit.Assert.assertNotNull(factory75);
    org.junit.Assert.assertNotNull(factory77);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertNotNull(databaseNamePattern80);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(factory82);
    org.junit.Assert.assertNotNull(factory84);
  }

  @Test
  public void test1105() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1105");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator4.progressMonitorFactory(
        progressMonitorFactory5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.monitors(monitors7);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator8.progressMonitorFactory(
        progressMonitorFactory9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.itraLogProvider(
        logProvider11);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.fFileSystemAbstraction(
        fileSystemAbstraction13);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
  }

  @Test
  public void test1106() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1106");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.systemNanoClock(
        systemNanoClock7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.itraLogProvider(
        logProvider9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.uLogProvider(
        logProvider11);
    org.neo4j.time.SystemNanoClock systemNanoClock13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator10.systemNanoClock(
        systemNanoClock13);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator10.progressMonitorFactory(
        progressMonitorFactory15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    io.github.onograph.backup.BackupRunner.Generator generator18 = generator16.itraLogProvider(
        logProvider17);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
    org.junit.Assert.assertNotNull(generator18);
  }

  @Test
  public void test1107() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1107");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    java.nio.file.Path path15 = backupEnvironment12.getPbPath();
    java.nio.file.Path path16 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path15);
    java.nio.file.Path path17 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path16);
    java.nio.file.Path path18 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path16);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory19.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory19.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory25.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment31 = factory25.bulBackupEnvironment();
    boolean boolean32 = backupEnvironment31.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional33 = backupEnvironment31.geicmaOptional();
    java.nio.file.Path path34 = backupEnvironment31.getPbPath();
    java.nio.file.Path path35 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path34);
    java.nio.file.Path path36 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path35);
    boolean boolean37 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path36);
    java.nio.file.Path path38 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path36);
    io.github.onograph.backup.FileMoverService fileMoverService39 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path18, path38);
    java.nio.file.Path path40 = fileMoverService39.filPath();
    java.nio.file.Path path41 = fileMoverService39.filPath();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(path15);
    org.junit.Assert.assertNotNull(path16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(backupEnvironment31);
    org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional33);
    org.junit.Assert.assertNotNull(path34);
    org.junit.Assert.assertNotNull(path35);
    org.junit.Assert.assertNotNull(path36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    org.junit.Assert.assertNotNull(path38);
    org.junit.Assert.assertNotNull(fileMoverService39);
    org.junit.Assert.assertNotNull(path40);
    org.junit.Assert.assertNotNull(path41);
  }

  @Test
  public void test1108() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1108");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern13 = backupEnvironment12.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress14 = backupEnvironment12.getSocketAddress();
    java.nio.file.Path path15 = backupEnvironment12.getRpPath();
    boolean boolean16 = backupEnvironment12.getIsBftf();
    java.nio.file.Path path17 = backupEnvironment12.getRpPath();
    java.nio.file.Path path18 = backupEnvironment12.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config20 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.config(config20);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.isRp(true);
    org.neo4j.configuration.Config config24 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.config(config24);
    org.neo4j.configuration.helpers.SocketAddress socketAddress26 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory23.wihadsBackupEnvironmentFactory(
        socketAddress26);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory28.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory31.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory31.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory31.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory37.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment43 = factory37.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern44 = backupEnvironment43.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress45 = backupEnvironment43.getSocketAddress();
    java.nio.file.Path path46 = backupEnvironment43.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory28.pbPath(path46);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory48.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory51.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory51.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory51.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory57.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory57.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment63 = factory57.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern64 = backupEnvironment63.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress65 = backupEnvironment63.getSocketAddress();
    java.nio.file.Path path66 = backupEnvironment63.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = factory48.pbPath(path66);
    io.github.onograph.backup.FileMoverService fileMoverService68 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path46, path66);
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory23.pbPath(path66);
    java.nio.file.Path path70 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path66);
    io.github.onograph.backup.FileMoverService fileMoverService71 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path18, path70);
    java.nio.file.Path path72 = fileMoverService71.filPath();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(databaseNamePattern13);
    org.junit.Assert.assertNotNull(socketAddress14);
    org.junit.Assert.assertNotNull(path15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(backupEnvironment43);
    org.junit.Assert.assertNotNull(databaseNamePattern44);
    org.junit.Assert.assertNotNull(socketAddress45);
    org.junit.Assert.assertNotNull(path46);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(backupEnvironment63);
    org.junit.Assert.assertNotNull(databaseNamePattern64);
    org.junit.Assert.assertNotNull(socketAddress65);
    org.junit.Assert.assertNotNull(path66);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(fileMoverService68);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(path70);
    org.junit.Assert.assertNotNull(fileMoverService71);
    org.junit.Assert.assertNotNull(path72);
  }

  @Test
  public void test1109() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1109");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.systemNanoClock(
        systemNanoClock7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.itraLogProvider(
        logProvider9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator6.monitors(monitors11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.itraLogProvider(
        logProvider13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator14.uLogProvider(
        logProvider15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    io.github.onograph.backup.BackupRunner.Generator generator18 = generator16.itraLogProvider(
        logProvider17);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction19 = null;
    io.github.onograph.backup.BackupRunner.Generator generator20 = generator16.fFileSystemAbstraction(
        fileSystemAbstraction19);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
    org.junit.Assert.assertNotNull(generator18);
    org.junit.Assert.assertNotNull(generator20);
  }

  @Test
  public void test1110() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1110");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory4.wihadsBackupEnvironmentFactory(
        (int) (short) -1, "hi!");
    org.neo4j.configuration.Config config14 = factory13.gecfConfig();
    org.neo4j.consistency.checking.full.ConsistencyFlags consistencyFlags15 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction16 = null;
    org.neo4j.logging.LogProvider logProvider17 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory18.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory21.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory21.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory27.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment33 = factory27.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern34 = backupEnvironment33.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress35 = backupEnvironment33.getSocketAddress();
    java.nio.file.Path path36 = backupEnvironment33.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory18.pbPath(path36);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory41.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory41.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory41.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory47.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory47.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment53 = factory47.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern54 = backupEnvironment53.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress55 = backupEnvironment53.getSocketAddress();
    java.nio.file.Path path56 = backupEnvironment53.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory38.pbPath(path56);
    io.github.onograph.backup.FileMoverService fileMoverService58 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path36, path56);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory59 = null;
    io.github.onograph.backup.BackupVerificationServiceImpl backupVerificationServiceImpl60 = new io.github.onograph.backup.BackupVerificationServiceImpl(
        config14, consistencyFlags15, fileSystemAbstraction16, logProvider17, path56,
        progressMonitorFactory59);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction61 = null;
    io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl62 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler63 = null;
    org.neo4j.logging.LogProvider logProvider64 = null;
    org.neo4j.monitoring.Monitors monitors65 = null;
    org.neo4j.io.pagecache.PageCache pageCache66 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer67 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock68 = null;
    try {
      io.github.onograph.backup.RemoteBackupManager remoteBackupManager69 = new io.github.onograph.backup.RemoteBackupManager(
          config14, fileSystemAbstraction61, lifecycleCatchupManagerImpl62, jobScheduler63,
          logProvider64, monitors65, pageCache66, pageCacheTracer67, systemNanoClock68);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(config14);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(backupEnvironment33);
    org.junit.Assert.assertNotNull(databaseNamePattern34);
    org.junit.Assert.assertNotNull(socketAddress35);
    org.junit.Assert.assertNotNull(path36);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(backupEnvironment53);
    org.junit.Assert.assertNotNull(databaseNamePattern54);
    org.junit.Assert.assertNotNull(socketAddress55);
    org.junit.Assert.assertNotNull(path56);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(fileMoverService58);
  }

  @Test
  public void test1111() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1111");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.systemNanoClock(
        systemNanoClock7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.itraLogProvider(
        logProvider9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator6.monitors(monitors11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.uLogProvider(
        logProvider13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator14.itraLogProvider(
        logProvider15);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    io.github.onograph.backup.BackupRunner.Generator generator18 = generator14.fFileSystemAbstraction(
        fileSystemAbstraction17);
    java.lang.Class<?> wildcardClass19 = generator18.getClass();
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
    org.junit.Assert.assertNotNull(generator18);
    org.junit.Assert.assertNotNull(wildcardClass19);
  }

  @Test
  public void test1112() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1112");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern15 = backupEnvironment14.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress16 = backupEnvironment14.getSocketAddress();
    java.nio.file.Path path17 = backupEnvironment14.getRpPath();
    boolean boolean18 = backupEnvironment14.getIsBftf();
    java.nio.file.Path path19 = backupEnvironment14.getRpPath();
    org.neo4j.memory.MemoryTracker memoryTracker20 = backupEnvironment14.getMemoryTracker();
    java.nio.file.Path path21 = backupEnvironment14.getRpPath();
    java.nio.file.Path path22 = backupEnvironment14.getRpPath();
    java.nio.file.Path path23 = backupEnvironment14.getRpPath();
    org.neo4j.logging.LogProvider logProvider24 = null;
    org.neo4j.io.pagecache.PageCache pageCache25 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer26 = null;
    try {
      io.github.onograph.backup.BackupMetaService backupMetaService27 = new io.github.onograph.backup.BackupMetaService(
          fileSystemAbstraction0, "hi!", path23, logProvider24, pageCache25, pageCacheTracer26);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertNotNull(databaseNamePattern15);
    org.junit.Assert.assertNotNull(socketAddress16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(memoryTracker20);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertNotNull(path22);
    org.junit.Assert.assertNotNull(path23);
  }

  @Test
  public void test1113() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1113");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    java.nio.file.Path path7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory0.pbPath(path7);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isFtfb(false);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern11 = factory10.gedtenprDatabaseNamePattern();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(databaseNamePattern11);
  }

  @Test
  public void test1114() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1114");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isFtfb(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory2.wihadsBackupEnvironmentFactory(
        (int) (byte) -1, "hi!");
    java.nio.file.Path path12 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.prPath(path12);
    org.neo4j.configuration.Config config14 = factory13.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory13.shouldPrep(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions17 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.miAuthMetaOptions(
        authMetaOptions17);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(config14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
  }

  @Test
  public void test1115() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1115");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    java.nio.file.Path path3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.prPath(path3);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.prPath(path5);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory12.isRp(false);
    java.nio.file.Path path17 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.prPath(path17);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern19 = factory18.gedtenprDatabaseNamePattern();
    org.neo4j.configuration.Config config20 = factory18.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory11.config(config20);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction22 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config24 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.config(config24);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.isRp(true);
    org.neo4j.configuration.Config config28 = factory25.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory25.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory31.isCc(false);
    java.nio.file.Path path34 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory31.prPath(path34);
    java.nio.file.Path path36 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory35.prPath(path36);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isCc(false);
    java.nio.file.Path path41 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory38.prPath(path41);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config44 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory43.config(config44);
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory45.isRp(true);
    org.neo4j.configuration.Config config48 = factory45.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory38.config(config48);
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory37.config(config48);
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory30.config(config48);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction52 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory53.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory53.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory53.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory59.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory64 = factory59.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment65 = factory59.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker66 = backupEnvironment65.getMemoryTracker();
    org.neo4j.io.pagecache.PageCache pageCache67 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager68 = new io.github.onograph.backup.BackupRestorationManager(
        config48, fileSystemAbstraction52, memoryTracker66, pageCache67);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction69 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory72 = factory70.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory74 = factory70.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory76 = factory70.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory78 = factory76.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory76.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment82 = factory76.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern83 = backupEnvironment82.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress84 = backupEnvironment82.getSocketAddress();
    java.nio.file.Path path85 = backupEnvironment82.getRpPath();
    boolean boolean86 = backupEnvironment82.getIsBftf();
    java.nio.file.Path path87 = backupEnvironment82.getRpPath();
    org.neo4j.memory.MemoryTracker memoryTracker88 = backupEnvironment82.getMemoryTracker();
    org.neo4j.io.pagecache.PageCache pageCache89 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager90 = new io.github.onograph.backup.BackupRestorationManager(
        config48, fileSystemAbstraction69, memoryTracker88, pageCache89);
    org.neo4j.io.pagecache.PageCache pageCache91 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager92 = new io.github.onograph.backup.BackupRestorationManager(
        config20, fileSystemAbstraction22, memoryTracker88, pageCache91);
    io.github.onograph.backup.BackupEnvironment.Factory factory93 = factory4.config(config20);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern94 = factory93.gedtenprDatabaseNamePattern();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(databaseNamePattern19);
    org.junit.Assert.assertNotNull(config20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(config28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(config48);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory64);
    org.junit.Assert.assertNotNull(backupEnvironment65);
    org.junit.Assert.assertNotNull(memoryTracker66);
    org.junit.Assert.assertNotNull(factory70);
    org.junit.Assert.assertNotNull(factory72);
    org.junit.Assert.assertNotNull(factory74);
    org.junit.Assert.assertNotNull(factory76);
    org.junit.Assert.assertNotNull(factory78);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(backupEnvironment82);
    org.junit.Assert.assertNotNull(databaseNamePattern83);
    org.junit.Assert.assertNotNull(socketAddress84);
    org.junit.Assert.assertNotNull(path85);
    org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    org.junit.Assert.assertNotNull(path87);
    org.junit.Assert.assertNotNull(memoryTracker88);
    org.junit.Assert.assertNotNull(factory93);
    org.junit.Assert.assertNotNull(databaseNamePattern94);
  }

  @Test
  public void test1116() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1116");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory4.wihadsBackupEnvironmentFactory(
        (int) (short) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory4.wihadsBackupEnvironmentFactory(
        0, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory4.isCc(true);
    org.neo4j.configuration.Config config19 = factory18.gecfConfig();
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions20 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory18.miAuthMetaOptions(
        authMetaOptions20);
    org.neo4j.configuration.Config config22 = factory18.gecfConfig();
    java.lang.Class<?> wildcardClass23 = config22.getClass();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(config19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(config22);
    org.junit.Assert.assertNotNull(wildcardClass23);
  }

  @Test
  public void test1117() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1117");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory3 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config4 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = factory3.config(config4);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory5.isRp(true);
    org.neo4j.configuration.Config config8 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.config(config8);
    org.neo4j.configuration.helpers.SocketAddress socketAddress10 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.wihadsBackupEnvironmentFactory(
        socketAddress10);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory15.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory15.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory21.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment27 = factory21.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern28 = backupEnvironment27.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress29 = backupEnvironment27.getSocketAddress();
    java.nio.file.Path path30 = backupEnvironment27.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory12.pbPath(path30);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory35.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory35.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory35.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory41.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory41.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment47 = factory41.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern48 = backupEnvironment47.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress49 = backupEnvironment47.getSocketAddress();
    java.nio.file.Path path50 = backupEnvironment47.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory32.pbPath(path50);
    io.github.onograph.backup.FileMoverService fileMoverService52 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path30, path50);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory7.pbPath(path50);
    boolean boolean54 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path50);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory0.prPath(path50);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory55.shouldPrep(true);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions58 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory57.miAuthMetaOptions(
        authMetaOptions58);
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory59.isGcc(
        (java.lang.Boolean) true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory3);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(backupEnvironment27);
    org.junit.Assert.assertNotNull(databaseNamePattern28);
    org.junit.Assert.assertNotNull(socketAddress29);
    org.junit.Assert.assertNotNull(path30);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(backupEnvironment47);
    org.junit.Assert.assertNotNull(databaseNamePattern48);
    org.junit.Assert.assertNotNull(socketAddress49);
    org.junit.Assert.assertNotNull(path50);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(fileMoverService52);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory61);
  }

  @Test
  public void test1118() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1118");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator4.progressMonitorFactory(
        progressMonitorFactory5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.monitors(monitors7);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator8.progressMonitorFactory(
        progressMonitorFactory9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.monitors(monitors11);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.fFileSystemAbstraction(
        fileSystemAbstraction13);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
  }

  @Test
  public void test1119() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1119");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment backupEnvironment7 = factory6.bulBackupEnvironment();
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory8.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory8.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config18 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.config(config18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isRp(true);
    org.neo4j.configuration.Config config22 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.config(config22);
    org.neo4j.configuration.helpers.SocketAddress socketAddress24 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory21.wihadsBackupEnvironmentFactory(
        socketAddress24);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config27 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.config(config27);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory28.isRp(true);
    org.neo4j.configuration.Config config31 = factory28.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory21.config(config31);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory16.config(config31);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction34 = null;
    org.neo4j.memory.MemoryTracker memoryTracker35 = null;
    org.neo4j.io.pagecache.PageCache pageCache36 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager37 = new io.github.onograph.backup.BackupRestorationManager(
        config31, fileSystemAbstraction34, memoryTracker35, pageCache36);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory6.config(config31);
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isGcc(
        (java.lang.Boolean) true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(backupEnvironment7);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(config31);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
  }

  @Test
  public void test1120() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1120");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.systemNanoClock(
        systemNanoClock7);
    io.github.onograph.backup.BackupRunner backupRunner9 = generator6.bulBackupRunner();
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory10.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory10.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory16.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment22 = factory16.bulBackupEnvironment();
    boolean boolean23 = backupEnvironment22.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional24 = backupEnvironment22.geicmaOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional25 = backupEnvironment22.geicmaOptional();
    boolean boolean26 = backupEnvironment22.getIsBftf();
    java.nio.file.Path path27 = backupEnvironment22.getRpPath();
    try {
      backupRunner9.excebcpForBa(backupEnvironment22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(backupRunner9);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(backupEnvironment22);
    org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional24);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional25);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    org.junit.Assert.assertNotNull(path27);
  }

  @Test
  public void test1121() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1121");
    }
    io.github.onograph.backup.CommandProviderBackupImpl commandProviderBackupImpl0 = new io.github.onograph.backup.CommandProviderBackupImpl();
    int int1 = commandProviderBackupImpl0.getPriority();
    int int2 = commandProviderBackupImpl0.getPriority();
    org.neo4j.cli.Command.CommandType commandType3 = commandProviderBackupImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType4 = commandProviderBackupImpl0.commandType();
    int int5 = commandProviderBackupImpl0.getPriority();
    org.neo4j.cli.Command.CommandType commandType6 = commandProviderBackupImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType7 = commandProviderBackupImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType8 = commandProviderBackupImpl0.commandType();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType6 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType6.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue(
        "'" + commandType7 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType7.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue(
        "'" + commandType8 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType8.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
  }

  @Test
  public void test1122() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1122");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory4.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.shouldPrep(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory12.isFtfb(true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
  }

  @Test
  public void test1123() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1123");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.logging.LogProvider logProvider7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.uLogProvider(
        logProvider7);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator8.fFileSystemAbstraction(
        fileSystemAbstraction9);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator8.progressMonitorFactory(
        progressMonitorFactory11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.monitors(monitors13);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
  }

  @Test
  public void test1124() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1124");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupMetadataRepository backupMetadataRepository1 = new io.github.onograph.backup.BackupMetadataRepository(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.config(config3);
    org.neo4j.configuration.helpers.SocketAddress socketAddress5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.wihadsBackupEnvironmentFactory(
        socketAddress5);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config8 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.config(config8);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isRp(true);
    org.neo4j.configuration.Config config12 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.config(config12);
    org.neo4j.configuration.helpers.SocketAddress socketAddress14 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory11.wihadsBackupEnvironmentFactory(
        socketAddress14);
    org.neo4j.configuration.helpers.SocketAddress socketAddress16 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory11.wihadsBackupEnvironmentFactory(
        socketAddress16);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory11.wihadsBackupEnvironmentFactory(
        (int) (short) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory11.wihadsBackupEnvironmentFactory(
        0, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory11.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory26.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory26.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory32.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment38 = factory32.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern39 = backupEnvironment38.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress40 = backupEnvironment38.getSocketAddress();
    java.nio.file.Path path41 = backupEnvironment38.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory42.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory42.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory42.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory48.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory48.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment54 = factory48.bulBackupEnvironment();
    boolean boolean55 = backupEnvironment54.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional56 = backupEnvironment54.geicmaOptional();
    java.nio.file.Path path57 = backupEnvironment54.getPbPath();
    java.nio.file.Path path58 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path57);
    java.nio.file.Path path59 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path58);
    boolean boolean60 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path59);
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory61.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory65 = factory61.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = factory61.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory67.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory72 = factory67.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment73 = factory67.bulBackupEnvironment();
    boolean boolean74 = backupEnvironment73.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional75 = backupEnvironment73.geicmaOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional76 = backupEnvironment73.geicmaOptional();
    java.nio.file.Path path77 = backupEnvironment73.getPbPath();
    java.nio.file.Path path78 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path77);
    io.github.onograph.backup.FileMoverService fileMoverService79 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path59, path78);
    io.github.onograph.backup.FileMoverService fileMoverService80 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path41, path59);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory25.prPath(path59);
    io.github.onograph.backup.BackupEnvironment.Factory factory82 = factory6.prPath(path59);
    java.lang.String[] strArray84 = new java.lang.String[]{"hi!"};
    java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
    boolean boolean86 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList85, strArray84);
    try {
      backupMetadataRepository1.wrtForPaLi(path59, (java.util.List<java.lang.String>) strList85);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(backupEnvironment38);
    org.junit.Assert.assertNotNull(databaseNamePattern39);
    org.junit.Assert.assertNotNull(socketAddress40);
    org.junit.Assert.assertNotNull(path41);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(backupEnvironment54);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional56);
    org.junit.Assert.assertNotNull(path57);
    org.junit.Assert.assertNotNull(path58);
    org.junit.Assert.assertNotNull(path59);
    org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory65);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(factory72);
    org.junit.Assert.assertNotNull(backupEnvironment73);
    org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional75);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional76);
    org.junit.Assert.assertNotNull(path77);
    org.junit.Assert.assertNotNull(path78);
    org.junit.Assert.assertNotNull(fileMoverService79);
    org.junit.Assert.assertNotNull(fileMoverService80);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(factory82);
    org.junit.Assert.assertNotNull(strArray84);
    org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
  }

  @Test
  public void test1125() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1125");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory3 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config4 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = factory3.config(config4);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory5.isRp(true);
    org.neo4j.configuration.Config config8 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.config(config8);
    org.neo4j.configuration.helpers.SocketAddress socketAddress10 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.wihadsBackupEnvironmentFactory(
        socketAddress10);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory15.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory15.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory21.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment27 = factory21.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern28 = backupEnvironment27.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress29 = backupEnvironment27.getSocketAddress();
    java.nio.file.Path path30 = backupEnvironment27.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory12.pbPath(path30);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory35.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory35.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory35.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory41.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory41.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment47 = factory41.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern48 = backupEnvironment47.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress49 = backupEnvironment47.getSocketAddress();
    java.nio.file.Path path50 = backupEnvironment47.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory32.pbPath(path50);
    io.github.onograph.backup.FileMoverService fileMoverService52 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path30, path50);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory7.pbPath(path50);
    boolean boolean54 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path50);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory0.prPath(path50);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory0.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory58.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions61 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory58.miAuthMetaOptions(
        authMetaOptions61);
    io.github.onograph.backup.BackupEnvironment.Factory factory64 = factory62.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory66 = factory62.isCc(true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern67 = factory66.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory68 = factory0.databaseNamePattern(
        databaseNamePattern67);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions69 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = factory68.miAuthMetaOptions(
        authMetaOptions69);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory3);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(backupEnvironment27);
    org.junit.Assert.assertNotNull(databaseNamePattern28);
    org.junit.Assert.assertNotNull(socketAddress29);
    org.junit.Assert.assertNotNull(path30);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(backupEnvironment47);
    org.junit.Assert.assertNotNull(databaseNamePattern48);
    org.junit.Assert.assertNotNull(socketAddress49);
    org.junit.Assert.assertNotNull(path50);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(fileMoverService52);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(factory64);
    org.junit.Assert.assertNotNull(factory66);
    org.junit.Assert.assertNotNull(databaseNamePattern67);
    org.junit.Assert.assertNotNull(factory68);
    org.junit.Assert.assertNotNull(factory70);
  }

  @Test
  public void test1126() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1126");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = factory2.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory2.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    java.nio.file.Path path11 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory8.prPath(path11);
    java.nio.file.Path path13 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.prPath(path13);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isCc(false);
    java.nio.file.Path path18 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory15.prPath(path18);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config21 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.config(config21);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory22.isRp(true);
    org.neo4j.configuration.Config config25 = factory22.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory15.config(config25);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory14.config(config25);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory7.config(config25);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern29 = factory28.gedtenprDatabaseNamePattern();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(config5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(config25);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(databaseNamePattern29);
  }

  @Test
  public void test1127() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1127");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.config(config3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isRp(true);
    org.neo4j.configuration.Config config7 = factory4.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.isCc(false);
    java.nio.file.Path path13 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory10.prPath(path13);
    java.nio.file.Path path15 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.prPath(path15);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isCc(false);
    java.nio.file.Path path20 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory17.prPath(path20);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config23 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory22.config(config23);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isRp(true);
    org.neo4j.configuration.Config config27 = factory24.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory17.config(config27);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory16.config(config27);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory9.config(config27);
    org.neo4j.consistency.checking.full.ConsistencyFlags consistencyFlags31 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction32 = null;
    org.neo4j.logging.LogProvider logProvider33 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction34 = null;
    io.github.onograph.backup.FileMover fileMover35 = new io.github.onograph.backup.FileMover(
        fileSystemAbstraction34);
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory36.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory36.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory36.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory42.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory42.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment48 = factory42.bulBackupEnvironment();
    boolean boolean49 = backupEnvironment48.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional50 = backupEnvironment48.geicmaOptional();
    java.nio.file.Path path51 = backupEnvironment48.getPbPath();
    java.nio.file.Path path52 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path51);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream53 = fileMover35._trrfrmnStream(
        path51);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory54.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory57.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory57.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory57.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory65 = factory63.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory68 = factory63.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment69 = factory63.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern70 = backupEnvironment69.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress71 = backupEnvironment69.getSocketAddress();
    java.nio.file.Path path72 = backupEnvironment69.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory73 = factory54.pbPath(path72);
    io.github.onograph.backup.BackupEnvironment.Factory factory74 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory76 = factory74.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory77 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = factory77.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory77.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory83 = factory77.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory85 = factory83.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory88 = factory83.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment89 = factory83.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern90 = backupEnvironment89.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress91 = backupEnvironment89.getSocketAddress();
    java.nio.file.Path path92 = backupEnvironment89.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory93 = factory74.pbPath(path92);
    io.github.onograph.backup.FileMoverService fileMoverService94 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path72, path92);
    java.nio.file.Path path95 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path72);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream96 = fileMover35._trrfrmnStream(
        path95);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory97 = null;
    io.github.onograph.backup.BackupVerificationServiceImpl backupVerificationServiceImpl98 = new io.github.onograph.backup.BackupVerificationServiceImpl(
        config27, consistencyFlags31, fileSystemAbstraction32, logProvider33, path95,
        progressMonitorFactory97);
    try {
      boolean boolean99 = backupIOService1.isExsForPa(path95);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(config7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(config27);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(backupEnvironment48);
    org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional50);
    org.junit.Assert.assertNotNull(path51);
    org.junit.Assert.assertNotNull(path52);
    org.junit.Assert.assertNotNull(fileMoverServiceStream53);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory65);
    org.junit.Assert.assertNotNull(factory68);
    org.junit.Assert.assertNotNull(backupEnvironment69);
    org.junit.Assert.assertNotNull(databaseNamePattern70);
    org.junit.Assert.assertNotNull(socketAddress71);
    org.junit.Assert.assertNotNull(path72);
    org.junit.Assert.assertNotNull(factory73);
    org.junit.Assert.assertNotNull(factory74);
    org.junit.Assert.assertNotNull(factory76);
    org.junit.Assert.assertNotNull(factory77);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(factory83);
    org.junit.Assert.assertNotNull(factory85);
    org.junit.Assert.assertNotNull(factory88);
    org.junit.Assert.assertNotNull(backupEnvironment89);
    org.junit.Assert.assertNotNull(databaseNamePattern90);
    org.junit.Assert.assertNotNull(socketAddress91);
    org.junit.Assert.assertNotNull(path92);
    org.junit.Assert.assertNotNull(factory93);
    org.junit.Assert.assertNotNull(fileMoverService94);
    org.junit.Assert.assertNotNull(path95);
    org.junit.Assert.assertNotNull(fileMoverServiceStream96);
  }

  @Test
  public void test1128() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1128");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.GdbIdRepo gdbIdRepo1 = new io.github.onograph.backup.GdbIdRepo(
        fileSystemAbstraction0);
    org.neo4j.kernel.database.DatabaseId databaseId2 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory3 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = factory3.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory3.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory3.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory9.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment15 = factory9.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker16 = backupEnvironment15.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern17 = backupEnvironment15.getDatabaseNamePattern();
    boolean boolean18 = backupEnvironment15.getIsBftf();
    java.nio.file.Path path19 = backupEnvironment15.getRpPath();
    java.nio.file.Path path20 = backupEnvironment15.getPbPath();
    java.nio.file.Path path21 = backupEnvironment15.getPbPath();
    java.nio.file.Path path22 = backupEnvironment15.getRpPath();
    try {
      gdbIdRepo1.wrdaiForDaPa(databaseId2, path22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory3);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(backupEnvironment15);
    org.junit.Assert.assertNotNull(memoryTracker16);
    org.junit.Assert.assertNotNull(databaseNamePattern17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertNotNull(path22);
  }

  @Test
  public void test1129() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1129");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isFtfb(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isRp(false);
    java.nio.file.Path path16 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory13.pbPath(path16);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory17.shouldPrep(false);
    io.github.onograph.backup.BackupEnvironment backupEnvironment22 = factory21.bulBackupEnvironment();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(backupEnvironment22);
  }

  @Test
  public void test1130() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1130");
    }
    io.github.onograph.backup.Backup backup2 = io.github.onograph.backup.Backup.froBackup(
        (int) (short) 100, "hi!");
    org.junit.Assert.assertNotNull(backup2);
  }

  @Test
  public void test1131() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1131");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.prPath(path5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isFtfb(true);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = factory8.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory8.wihadsBackupEnvironmentFactory(
        (-1), "");
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isFtfb(true);
    org.neo4j.configuration.Config config15 = factory12.gecfConfig();
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions16 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory12.miAuthMetaOptions(
        authMetaOptions16);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory18.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory18.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory18.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory24.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment30 = factory24.bulBackupEnvironment();
    boolean boolean31 = backupEnvironment30.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional32 = backupEnvironment30.geicmaOptional();
    java.nio.file.Path path33 = backupEnvironment30.getPbPath();
    java.nio.file.Path path34 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path33);
    java.nio.file.Path path35 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path34);
    java.nio.file.Path path36 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path34);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config38 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.config(config38);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory39.isRp(true);
    org.neo4j.configuration.Config config42 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory41.config(config42);
    org.neo4j.configuration.helpers.SocketAddress socketAddress44 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory41.wihadsBackupEnvironmentFactory(
        socketAddress44);
    org.neo4j.configuration.helpers.SocketAddress socketAddress46 = factory41.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory41.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory48.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment backupEnvironment51 = factory50.bulBackupEnvironment();
    java.nio.file.Path path52 = backupEnvironment51.getPbPath();
    io.github.onograph.backup.FileMoverService fileMoverService53 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path36, path52);
    java.nio.file.Path path54 = fileMoverService53.filPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory12.pbPath(path54);
    io.github.onograph.backup.BackupEnvironment backupEnvironment56 = factory12.bulBackupEnvironment();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNull(socketAddress9);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(config15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(backupEnvironment30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional32);
    org.junit.Assert.assertNotNull(path33);
    org.junit.Assert.assertNotNull(path34);
    org.junit.Assert.assertNotNull(path35);
    org.junit.Assert.assertNotNull(path36);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNull(socketAddress46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(backupEnvironment51);
    org.junit.Assert.assertNotNull(path52);
    org.junit.Assert.assertNotNull(fileMoverService53);
    org.junit.Assert.assertNotNull(path54);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(backupEnvironment56);
  }

  @Test
  public void test1132() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1132");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    java.nio.file.Path path3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.prPath(path3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config8 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.config(config8);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory9.isSicc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern14 = factory9.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory6.databaseNamePattern(
        databaseNamePattern14);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions16 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.miAuthMetaOptions(
        authMetaOptions16);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory15.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory20.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory20.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory26.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment32 = factory26.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern33 = backupEnvironment32.getDatabaseNamePattern();
    boolean boolean34 = backupEnvironment32.getIsBftf();
    org.neo4j.configuration.helpers.SocketAddress socketAddress35 = backupEnvironment32.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory15.wihadsBackupEnvironmentFactory(
        socketAddress35);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory37.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory37.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory43.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory43.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment49 = factory43.bulBackupEnvironment();
    boolean boolean50 = backupEnvironment49.getIsBftf();
    org.neo4j.memory.MemoryTracker memoryTracker51 = backupEnvironment49.getMemoryTracker();
    org.neo4j.configuration.helpers.SocketAddress socketAddress52 = backupEnvironment49.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory36.wihadsBackupEnvironmentFactory(
        socketAddress52);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(databaseNamePattern14);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(backupEnvironment32);
    org.junit.Assert.assertNotNull(databaseNamePattern33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(socketAddress35);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(backupEnvironment49);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    org.junit.Assert.assertNotNull(memoryTracker51);
    org.junit.Assert.assertNotNull(socketAddress52);
    org.junit.Assert.assertNotNull(factory53);
  }

  @Test
  public void test1133() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1133");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.logging.LogProvider logProvider7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.uLogProvider(
        logProvider7);
    io.github.onograph.backup.BackupRunner backupRunner9 = generator6.bulBackupRunner();
    org.neo4j.logging.LogProvider logProvider10 = null;
    io.github.onograph.backup.BackupRunner.Generator generator11 = generator6.itraLogProvider(
        logProvider10);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction12 = null;
    io.github.onograph.backup.BackupRunner.Generator generator13 = generator6.fFileSystemAbstraction(
        fileSystemAbstraction12);
    io.github.onograph.backup.BackupRunner backupRunner14 = generator6.bulBackupRunner();
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(backupRunner9);
    org.junit.Assert.assertNotNull(generator11);
    org.junit.Assert.assertNotNull(generator13);
    org.junit.Assert.assertNotNull(backupRunner14);
  }

  @Test
  public void test1134() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1134");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator4.progressMonitorFactory(
        progressMonitorFactory5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.monitors(monitors7);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator8.progressMonitorFactory(
        progressMonitorFactory9);
    io.github.onograph.backup.BackupRunner backupRunner11 = generator8.bulBackupRunner();
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(backupRunner11);
  }

  @Test
  public void test1135() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1135");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = factory2.gecfConfig();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction6 = null;
    org.neo4j.memory.MemoryTracker memoryTracker7 = null;
    org.neo4j.io.pagecache.PageCache pageCache8 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager9 = new io.github.onograph.backup.BackupRestorationManager(
        config5, fileSystemAbstraction6, memoryTracker7, pageCache8);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction10 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config12 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.config(config12);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isRp(true);
    org.neo4j.configuration.Config config16 = factory13.gecfConfig();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.memory.MemoryTracker memoryTracker18 = null;
    org.neo4j.io.pagecache.PageCache pageCache19 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager20 = new io.github.onograph.backup.BackupRestorationManager(
        config16, fileSystemAbstraction17, memoryTracker18, pageCache19);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction21 = null;
    org.neo4j.configuration.Config config22 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction23 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    java.nio.file.Path path27 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory24.prPath(path27);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config30 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory29.config(config30);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory31.isRp(true);
    org.neo4j.configuration.Config config34 = factory31.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory24.config(config34);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction36 = null;
    org.neo4j.configuration.Config config37 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction38 = null;
    java.nio.file.Path[] pathArray39 = new java.nio.file.Path[]{};
    java.util.LinkedHashSet<java.nio.file.Path> pathSet40 = new java.util.LinkedHashSet<java.nio.file.Path>();
    boolean boolean41 = java.util.Collections.addAll(
        (java.util.Collection<java.nio.file.Path>) pathSet40, pathArray39);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta42 = new io.github.onograph.backup.BackupRestoreMeta(
        config37, fileSystemAbstraction38, (java.util.Set<java.nio.file.Path>) pathSet40);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta43 = new io.github.onograph.backup.BackupRestoreMeta(
        config34, fileSystemAbstraction36, (java.util.Set<java.nio.file.Path>) pathSet40);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta44 = new io.github.onograph.backup.BackupRestoreMeta(
        config22, fileSystemAbstraction23, (java.util.Set<java.nio.file.Path>) pathSet40);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta45 = new io.github.onograph.backup.BackupRestoreMeta(
        config16, fileSystemAbstraction21, (java.util.Set<java.nio.file.Path>) pathSet40);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta46 = new io.github.onograph.backup.BackupRestoreMeta(
        config5, fileSystemAbstraction10, (java.util.Set<java.nio.file.Path>) pathSet40);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(config5);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(config16);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(config34);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(pathArray39);
    org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
  }

  @Test
  public void test1136() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1136");
    }
    io.github.onograph.backup.Backup backup2 = io.github.onograph.backup.Backup.froBackup((int) '#',
        "");
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory10.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment16 = factory10.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern17 = backupEnvironment16.getDatabaseNamePattern();
    boolean boolean18 = backupEnvironment16.getIsBftf();
    boolean boolean19 = backupEnvironment16.getIsBftf();
    java.nio.file.Path path20 = backupEnvironment16.getRpPath();
    java.nio.file.Path path21 = backupEnvironment16.getRpPath();
    java.nio.file.Path path22 = backupEnvironment16.getPbPath();
    try {
      io.github.onograph.backup.Backup.BackupRespState backupRespState23 = backup2.bakBackupBackupRespState(
          "database.id", path22);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.RuntimeException; message: *** Error:  3b02b00a-232a-454b-823b-025cc97a58b8");
    } catch (java.lang.RuntimeException e) {
    }
    org.junit.Assert.assertNotNull(backup2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(backupEnvironment16);
    org.junit.Assert.assertNotNull(databaseNamePattern17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertNotNull(path22);
  }

  @Test
  public void test1137() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1137");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup3.isCc(true);
    io.github.onograph.backup.Backup backup7 = backup3.isBftf(false);
    io.github.onograph.backup.Backup backup9 = backup7.isBftf(true);
    io.github.onograph.backup.Backup backup11 = backup9.isCc(true);
    io.github.onograph.backup.Backup backup13 = backup11.isBftf(false);
    io.github.onograph.backup.Backup backup15 = backup13.isBftf(false);
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
    org.junit.Assert.assertNotNull(backup11);
    org.junit.Assert.assertNotNull(backup13);
    org.junit.Assert.assertNotNull(backup15);
  }

  @Test
  public void test1138() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1138");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.prPath(path5);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern7 = factory6.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory6.isRp(false);
    java.nio.file.Path path10 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.pbPath(path10);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isCc(false);
    java.nio.file.Path path15 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory12.prPath(path15);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config18 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.config(config18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isRp(true);
    org.neo4j.configuration.Config config22 = factory19.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory12.config(config22);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction24 = null;
    org.neo4j.configuration.Config config25 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction26 = null;
    java.nio.file.Path[] pathArray27 = new java.nio.file.Path[]{};
    java.util.LinkedHashSet<java.nio.file.Path> pathSet28 = new java.util.LinkedHashSet<java.nio.file.Path>();
    boolean boolean29 = java.util.Collections.addAll(
        (java.util.Collection<java.nio.file.Path>) pathSet28, pathArray27);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta30 = new io.github.onograph.backup.BackupRestoreMeta(
        config25, fileSystemAbstraction26, (java.util.Set<java.nio.file.Path>) pathSet28);
    io.github.onograph.backup.BackupRestoreMeta backupRestoreMeta31 = new io.github.onograph.backup.BackupRestoreMeta(
        config22, fileSystemAbstraction24, (java.util.Set<java.nio.file.Path>) pathSet28);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory6.config(config22);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory34.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory34.shouldPrep(false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(databaseNamePattern7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(config22);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(pathArray27);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory38);
  }

  @Test
  public void test1139() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1139");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.logging.LogProvider logProvider7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.uLogProvider(
        logProvider7);
    org.neo4j.time.SystemNanoClock systemNanoClock9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.systemNanoClock(
        systemNanoClock9);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.fFileSystemAbstraction(
        fileSystemAbstraction11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.itraLogProvider(
        logProvider13);
    io.github.onograph.backup.BackupRunner backupRunner15 = generator12.bulBackupRunner();
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(backupRunner15);
  }

  @Test
  public void test1140() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1140");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    java.io.PrintStream printStream3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory10.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment16 = factory10.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker17 = backupEnvironment16.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern18 = backupEnvironment16.getDatabaseNamePattern();
    boolean boolean19 = backupEnvironment16.getIsBftf();
    java.nio.file.Path path20 = backupEnvironment16.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory21.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory21.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory27.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment33 = factory27.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern34 = backupEnvironment33.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress35 = backupEnvironment33.getSocketAddress();
    java.nio.file.Path path36 = backupEnvironment33.getRpPath();
    boolean boolean37 = backupEnvironment33.getIsBftf();
    java.nio.file.Path path38 = backupEnvironment33.getRpPath();
    org.neo4j.memory.MemoryTracker memoryTracker39 = backupEnvironment33.getMemoryTracker();
    java.nio.file.Path path40 = backupEnvironment33.getRpPath();
    org.neo4j.io.layout.DatabaseLayout databaseLayout41 = null;
    try {
      io.github.onograph.backup.GdbRestorer gdbRestorer42 = new io.github.onograph.backup.GdbRestorer(
          fileSystemAbstraction0, true, true, printStream3, path20, path40, databaseLayout41);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(backupEnvironment16);
    org.junit.Assert.assertNotNull(memoryTracker17);
    org.junit.Assert.assertNotNull(databaseNamePattern18);
    org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(backupEnvironment33);
    org.junit.Assert.assertNotNull(databaseNamePattern34);
    org.junit.Assert.assertNotNull(socketAddress35);
    org.junit.Assert.assertNotNull(path36);
    org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    org.junit.Assert.assertNotNull(path38);
    org.junit.Assert.assertNotNull(memoryTracker39);
    org.junit.Assert.assertNotNull(path40);
  }

  @Test
  public void test1141() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1141");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.fFileSystemAbstraction(
        fileSystemAbstraction7);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator8.progressMonitorFactory(
        progressMonitorFactory9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator8.monitors(monitors11);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
  }

  @Test
  public void test1142() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1142");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory9.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory9.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory15.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment21 = factory15.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern22 = backupEnvironment21.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress23 = backupEnvironment21.getSocketAddress();
    java.nio.file.Path path24 = backupEnvironment21.getRpPath();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction25 = null;
    io.github.onograph.backup.FileMover fileMover26 = new io.github.onograph.backup.FileMover(
        fileSystemAbstraction25);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory27.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory27.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory33.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory33.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment39 = factory33.bulBackupEnvironment();
    boolean boolean40 = backupEnvironment39.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional41 = backupEnvironment39.geicmaOptional();
    java.nio.file.Path path42 = backupEnvironment39.getPbPath();
    java.nio.file.Path path43 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path42);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream44 = fileMover26._trrfrmnStream(
        path42);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory45.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory48.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory48.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory48.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory54.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory54.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment60 = factory54.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern61 = backupEnvironment60.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress62 = backupEnvironment60.getSocketAddress();
    java.nio.file.Path path63 = backupEnvironment60.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory64 = factory45.pbPath(path63);
    io.github.onograph.backup.BackupEnvironment.Factory factory65 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = factory65.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory68 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = factory68.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory72 = factory68.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory74 = factory68.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory76 = factory74.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = factory74.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment80 = factory74.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern81 = backupEnvironment80.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress82 = backupEnvironment80.getSocketAddress();
    java.nio.file.Path path83 = backupEnvironment80.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory84 = factory65.pbPath(path83);
    io.github.onograph.backup.FileMoverService fileMoverService85 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path63, path83);
    java.nio.file.Path path86 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path63);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream87 = fileMover26._trrfrmnStream(
        path86);
    io.github.onograph.backup.FileMoverService fileMoverService88 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path24, path86);
    io.github.onograph.backup.BackupEnvironment.Factory factory89 = factory6.prPath(path24);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern90 = factory6.gedtenprDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress91 = factory6.getSocketAddress();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(backupEnvironment21);
    org.junit.Assert.assertNotNull(databaseNamePattern22);
    org.junit.Assert.assertNotNull(socketAddress23);
    org.junit.Assert.assertNotNull(path24);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(backupEnvironment39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional41);
    org.junit.Assert.assertNotNull(path42);
    org.junit.Assert.assertNotNull(path43);
    org.junit.Assert.assertNotNull(fileMoverServiceStream44);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(backupEnvironment60);
    org.junit.Assert.assertNotNull(databaseNamePattern61);
    org.junit.Assert.assertNotNull(socketAddress62);
    org.junit.Assert.assertNotNull(path63);
    org.junit.Assert.assertNotNull(factory64);
    org.junit.Assert.assertNotNull(factory65);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(factory68);
    org.junit.Assert.assertNotNull(factory70);
    org.junit.Assert.assertNotNull(factory72);
    org.junit.Assert.assertNotNull(factory74);
    org.junit.Assert.assertNotNull(factory76);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertNotNull(backupEnvironment80);
    org.junit.Assert.assertNotNull(databaseNamePattern81);
    org.junit.Assert.assertNotNull(socketAddress82);
    org.junit.Assert.assertNotNull(path83);
    org.junit.Assert.assertNotNull(factory84);
    org.junit.Assert.assertNotNull(fileMoverService85);
    org.junit.Assert.assertNotNull(path86);
    org.junit.Assert.assertNotNull(fileMoverServiceStream87);
    org.junit.Assert.assertNotNull(fileMoverService88);
    org.junit.Assert.assertNotNull(factory89);
    org.junit.Assert.assertNotNull(databaseNamePattern90);
    org.junit.Assert.assertNull(socketAddress91);
  }

  @Test
  public void test1143() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1143");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern13 = backupEnvironment12.getDatabaseNamePattern();
    boolean boolean14 = backupEnvironment12.getIsBftf();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern15 = backupEnvironment12.getDatabaseNamePattern();
    boolean boolean16 = backupEnvironment12.getIsBftf();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(databaseNamePattern13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertNotNull(databaseNamePattern15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
  }

  @Test
  public void test1144() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1144");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker15 = backupEnvironment14.getMemoryTracker();
    java.nio.file.Path path16 = backupEnvironment14.getPbPath();
    try {
      boolean boolean17 = backupIOService1.isExsForPa(path16);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertNotNull(memoryTracker15);
    org.junit.Assert.assertNotNull(path16);
  }

  @Test
  public void test1145() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1145");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("hi!");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(false);
    io.github.onograph.backup.Backup backup5 = backup1.isCc(false);
    io.github.onograph.backup.Backup backup7 = backup1.isBftf(false);
    java.io.OutputStream outputStream8 = null;
    try {
      io.github.onograph.backup.Backup backup9 = backup7.outputStream(outputStream8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: outputStream");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
  }

  @Test
  public void test1146() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1146");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = factory4.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory4.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory13.bulBackupEnvironment();
    java.nio.file.Path path15 = backupEnvironment14.getPbPath();
    boolean boolean16 = backupEnvironment14.getIsRp();
    org.neo4j.memory.MemoryTracker memoryTracker17 = backupEnvironment14.getMemoryTracker();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNull(socketAddress9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertNotNull(path15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(memoryTracker17);
  }

  @Test
  public void test1147() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1147");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory4.wihadsBackupEnvironmentFactory(
        (int) (short) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.isIcc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.Config config19 = factory18.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory4.config(config19);
    org.neo4j.consistency.checking.full.ConsistencyFlags consistencyFlags21 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction22 = null;
    org.neo4j.logging.LogProvider logProvider23 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory24.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory24.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory30.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory30.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment36 = factory30.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern37 = backupEnvironment36.getDatabaseNamePattern();
    boolean boolean38 = backupEnvironment36.getIsBftf();
    boolean boolean39 = backupEnvironment36.getIsBftf();
    java.nio.file.Path path40 = backupEnvironment36.getRpPath();
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory41 = null;
    io.github.onograph.backup.BackupVerificationServiceImpl backupVerificationServiceImpl42 = new io.github.onograph.backup.BackupVerificationServiceImpl(
        config19, consistencyFlags21, fileSystemAbstraction22, logProvider23, path40,
        progressMonitorFactory41);
    org.neo4j.io.layout.DatabaseLayout databaseLayout43 = null;
    try {
      backupVerificationServiceImpl42.chcsyForDa(databaseLayout43);
      org.junit.Assert.fail(
          "Expected exception of type io.github.onograph.backup.BackupVerificationErrorException; message: *** Error:  2915f124-983c-439d-b1ae-a9c5ad06642b");
    } catch (io.github.onograph.backup.BackupVerificationErrorException e) {
    }
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(config19);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(backupEnvironment36);
    org.junit.Assert.assertNotNull(databaseNamePattern37);
    org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    org.junit.Assert.assertNotNull(path40);
  }

  @Test
  public void test1148() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1148");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    io.github.onograph.backup.BackupRunner backupRunner7 = generator6.bulBackupRunner();
    io.github.onograph.backup.BackupRunner backupRunner8 = generator6.bulBackupRunner();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory9.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory9.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory15.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment21 = factory15.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker22 = backupEnvironment21.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern23 = backupEnvironment21.getDatabaseNamePattern();
    boolean boolean24 = backupEnvironment21.getIsBftf();
    org.neo4j.configuration.helpers.SocketAddress socketAddress25 = backupEnvironment21.getSocketAddress();
    org.neo4j.memory.MemoryTracker memoryTracker26 = backupEnvironment21.getMemoryTracker();
    try {
      backupRunner8.excebcpForBa(backupEnvironment21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(backupRunner7);
    org.junit.Assert.assertNotNull(backupRunner8);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(backupEnvironment21);
    org.junit.Assert.assertNotNull(memoryTracker22);
    org.junit.Assert.assertNotNull(databaseNamePattern23);
    org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    org.junit.Assert.assertNotNull(socketAddress25);
    org.junit.Assert.assertNotNull(memoryTracker26);
  }

  @Test
  public void test1149() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1149");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isFtfb(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isRp(false);
    java.nio.file.Path path16 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory13.pbPath(path16);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.shouldPrep(true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
  }

  @Test
  public void test1150() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1150");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory7.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory13.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment19 = factory13.bulBackupEnvironment();
    boolean boolean20 = backupEnvironment19.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional21 = backupEnvironment19.geicmaOptional();
    java.nio.file.Path path22 = backupEnvironment19.getPbPath();
    java.nio.file.Path path23 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path22);
    java.nio.file.Path path24 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path23);
    boolean boolean25 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path24);
    java.nio.file.Path path26 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path24);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory27.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory27.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory33.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory33.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment39 = factory33.bulBackupEnvironment();
    boolean boolean40 = backupEnvironment39.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional41 = backupEnvironment39.geicmaOptional();
    java.nio.file.Path path42 = backupEnvironment39.getPbPath();
    java.nio.file.Path path43 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path42);
    java.nio.file.Path path44 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path43);
    io.github.onograph.backup.FileMoverService fileMoverService45 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path24, path43);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory4.prPath(path43);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions47 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory46.miAuthMetaOptions(
        authMetaOptions47);
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory48.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory50.shouldPrep(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory53.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory53.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory53.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory59.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory64 = factory59.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment65 = factory59.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern66 = backupEnvironment65.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress67 = backupEnvironment65.getSocketAddress();
    java.nio.file.Path path68 = backupEnvironment65.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory52.pbPath(path68);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions70 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory71 = factory69.miAuthMetaOptions(
        authMetaOptions70);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(backupEnvironment19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional21);
    org.junit.Assert.assertNotNull(path22);
    org.junit.Assert.assertNotNull(path23);
    org.junit.Assert.assertNotNull(path24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(path26);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(backupEnvironment39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional41);
    org.junit.Assert.assertNotNull(path42);
    org.junit.Assert.assertNotNull(path43);
    org.junit.Assert.assertNotNull(path44);
    org.junit.Assert.assertNotNull(fileMoverService45);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory64);
    org.junit.Assert.assertNotNull(backupEnvironment65);
    org.junit.Assert.assertNotNull(databaseNamePattern66);
    org.junit.Assert.assertNotNull(socketAddress67);
    org.junit.Assert.assertNotNull(path68);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(factory71);
  }

  @Test
  public void test1151() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1151");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    java.nio.file.Path path15 = backupEnvironment12.getPbPath();
    java.nio.file.Path path16 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path15);
    java.nio.file.Path path17 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path16);
    boolean boolean18 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path17);
    java.nio.file.Path path19 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path17);
    java.nio.file.Path path20 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path19);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory21.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory21.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory27.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment33 = factory27.bulBackupEnvironment();
    boolean boolean34 = backupEnvironment33.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional35 = backupEnvironment33.geicmaOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional36 = backupEnvironment33.geicmaOptional();
    java.nio.file.Path path37 = backupEnvironment33.getPbPath();
    java.nio.file.Path path38 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path37);
    io.github.onograph.backup.FileMoverService fileMoverService39 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path19, path37);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction40 = null;
    io.github.onograph.backup.FileMover fileMover41 = new io.github.onograph.backup.FileMover(
        fileSystemAbstraction40);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory42.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory42.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory42.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory48.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory48.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment54 = factory48.bulBackupEnvironment();
    boolean boolean55 = backupEnvironment54.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional56 = backupEnvironment54.geicmaOptional();
    java.nio.file.Path path57 = backupEnvironment54.getPbPath();
    java.nio.file.Path path58 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path57);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream59 = fileMover41._trrfrmnStream(
        path57);
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory60.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory64 = factory60.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory66 = factory60.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory68 = factory66.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory71 = factory66.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment72 = factory66.bulBackupEnvironment();
    boolean boolean73 = backupEnvironment72.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional74 = backupEnvironment72.geicmaOptional();
    java.nio.file.Path path75 = backupEnvironment72.getPbPath();
    java.nio.file.Path path76 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path75);
    java.nio.file.Path path77 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path76);
    boolean boolean78 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path77);
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory79.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory83 = factory79.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory85 = factory79.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory87 = factory85.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory90 = factory85.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment91 = factory85.bulBackupEnvironment();
    boolean boolean92 = backupEnvironment91.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional93 = backupEnvironment91.geicmaOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional94 = backupEnvironment91.geicmaOptional();
    java.nio.file.Path path95 = backupEnvironment91.getPbPath();
    java.nio.file.Path path96 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path95);
    io.github.onograph.backup.FileMoverService fileMoverService97 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path77, path96);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream98 = fileMover41._trrfrmnStream(
        path77);
    io.github.onograph.backup.FileMoverService fileMoverService99 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path37, path77);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(path15);
    org.junit.Assert.assertNotNull(path16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(backupEnvironment33);
    org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional35);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional36);
    org.junit.Assert.assertNotNull(path37);
    org.junit.Assert.assertNotNull(path38);
    org.junit.Assert.assertNotNull(fileMoverService39);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(backupEnvironment54);
    org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional56);
    org.junit.Assert.assertNotNull(path57);
    org.junit.Assert.assertNotNull(path58);
    org.junit.Assert.assertNotNull(fileMoverServiceStream59);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(factory64);
    org.junit.Assert.assertNotNull(factory66);
    org.junit.Assert.assertNotNull(factory68);
    org.junit.Assert.assertNotNull(factory71);
    org.junit.Assert.assertNotNull(backupEnvironment72);
    org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional74);
    org.junit.Assert.assertNotNull(path75);
    org.junit.Assert.assertNotNull(path76);
    org.junit.Assert.assertNotNull(path77);
    org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(factory83);
    org.junit.Assert.assertNotNull(factory85);
    org.junit.Assert.assertNotNull(factory87);
    org.junit.Assert.assertNotNull(factory90);
    org.junit.Assert.assertNotNull(backupEnvironment91);
    org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional93);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional94);
    org.junit.Assert.assertNotNull(path95);
    org.junit.Assert.assertNotNull(path96);
    org.junit.Assert.assertNotNull(fileMoverService97);
    org.junit.Assert.assertNotNull(fileMoverServiceStream98);
    org.junit.Assert.assertNotNull(fileMoverService99);
  }

  @Test
  public void test1152() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1152");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern13 = backupEnvironment12.getDatabaseNamePattern();
    boolean boolean14 = backupEnvironment12.getIsBftf();
    boolean boolean15 = backupEnvironment12.getIsBftf();
    java.nio.file.Path path16 = backupEnvironment12.getRpPath();
    java.nio.file.Path path17 = backupEnvironment12.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory18.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory18.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory18.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory27.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory27.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory33.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory33.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment39 = factory33.bulBackupEnvironment();
    boolean boolean40 = backupEnvironment39.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional41 = backupEnvironment39.geicmaOptional();
    org.neo4j.memory.MemoryTracker memoryTracker42 = backupEnvironment39.getMemoryTracker();
    java.nio.file.Path path43 = backupEnvironment39.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory24.prPath(path43);
    java.nio.file.Path path45 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path43);
    io.github.onograph.backup.FileMoverService fileMoverService46 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path17, path43);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(databaseNamePattern13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(path16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(backupEnvironment39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional41);
    org.junit.Assert.assertNotNull(memoryTracker42);
    org.junit.Assert.assertNotNull(path43);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(path45);
    org.junit.Assert.assertNotNull(fileMoverService46);
  }

  @Test
  public void test1153() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1153");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup3.isCc(true);
    io.github.onograph.backup.Backup backup7 = backup5.isBftf(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory9.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory9.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory15.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment21 = factory15.bulBackupEnvironment();
    boolean boolean22 = backupEnvironment21.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional23 = backupEnvironment21.geicmaOptional();
    java.nio.file.Path path24 = backupEnvironment21.getPbPath();
    java.nio.file.Path path25 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path24);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config30 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory29.config(config30);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory31.isRp(true);
    org.neo4j.configuration.Config config34 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory33.config(config34);
    org.neo4j.configuration.helpers.SocketAddress socketAddress36 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory33.wihadsBackupEnvironmentFactory(
        socketAddress36);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory41.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory41.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory41.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory47.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory47.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment53 = factory47.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern54 = backupEnvironment53.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress55 = backupEnvironment53.getSocketAddress();
    java.nio.file.Path path56 = backupEnvironment53.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory38.pbPath(path56);
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory58.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory61.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory65 = factory61.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = factory61.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory67.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory72 = factory67.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment73 = factory67.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern74 = backupEnvironment73.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress75 = backupEnvironment73.getSocketAddress();
    java.nio.file.Path path76 = backupEnvironment73.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory77 = factory58.pbPath(path76);
    io.github.onograph.backup.FileMoverService fileMoverService78 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path56, path76);
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = factory33.pbPath(path76);
    boolean boolean80 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path76);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory26.prPath(path76);
    io.github.onograph.backup.FileMoverService fileMoverService82 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path24, path76);
    java.nio.file.Path path83 = fileMoverService82.filPath();
    try {
      io.github.onograph.backup.Backup.BackupRespState backupRespState84 = backup7.bakBackupBackupRespState(
          "database.id", path83);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.RuntimeException; message: *** Error:  3b02b00a-232a-454b-823b-025cc97a58b8");
    } catch (java.lang.RuntimeException e) {
    }
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(backupEnvironment21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional23);
    org.junit.Assert.assertNotNull(path24);
    org.junit.Assert.assertNotNull(path25);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(backupEnvironment53);
    org.junit.Assert.assertNotNull(databaseNamePattern54);
    org.junit.Assert.assertNotNull(socketAddress55);
    org.junit.Assert.assertNotNull(path56);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory65);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(factory72);
    org.junit.Assert.assertNotNull(backupEnvironment73);
    org.junit.Assert.assertNotNull(databaseNamePattern74);
    org.junit.Assert.assertNotNull(socketAddress75);
    org.junit.Assert.assertNotNull(path76);
    org.junit.Assert.assertNotNull(factory77);
    org.junit.Assert.assertNotNull(fileMoverService78);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(fileMoverService82);
    org.junit.Assert.assertNotNull(path83);
  }

  @Test
  public void test1154() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1154");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isSicc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern7 = factory2.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory2.isFtfb(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isFtfb(true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(databaseNamePattern7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
  }

  @Test
  public void test1155() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1155");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config8 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.config(config8);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory9.isSicc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern14 = factory9.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory2.databaseNamePattern(
        databaseNamePattern14);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory16.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory16.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory22.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory22.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment28 = factory22.bulBackupEnvironment();
    boolean boolean29 = backupEnvironment28.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional30 = backupEnvironment28.geicmaOptional();
    java.nio.file.Path path31 = backupEnvironment28.getPbPath();
    java.nio.file.Path path32 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path31);
    java.nio.file.Path path33 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path32);
    java.nio.file.Path path34 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path32);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory35.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory35.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory35.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory41.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory41.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment47 = factory41.bulBackupEnvironment();
    boolean boolean48 = backupEnvironment47.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional49 = backupEnvironment47.geicmaOptional();
    java.nio.file.Path path50 = backupEnvironment47.getPbPath();
    java.nio.file.Path path51 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path50);
    java.nio.file.Path path52 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path51);
    boolean boolean53 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path52);
    java.nio.file.Path path54 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path52);
    io.github.onograph.backup.FileMoverService fileMoverService55 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path34, path54);
    java.nio.file.Path path56 = fileMoverService55.filPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory15.pbPath(path56);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(databaseNamePattern14);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(backupEnvironment28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional30);
    org.junit.Assert.assertNotNull(path31);
    org.junit.Assert.assertNotNull(path32);
    org.junit.Assert.assertNotNull(path33);
    org.junit.Assert.assertNotNull(path34);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(backupEnvironment47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional49);
    org.junit.Assert.assertNotNull(path50);
    org.junit.Assert.assertNotNull(path51);
    org.junit.Assert.assertNotNull(path52);
    org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    org.junit.Assert.assertNotNull(path54);
    org.junit.Assert.assertNotNull(fileMoverService55);
    org.junit.Assert.assertNotNull(path56);
    org.junit.Assert.assertNotNull(factory57);
  }

  @Test
  public void test1156() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1156");
    }
    io.github.onograph.backup.CommandProviderBackupImpl commandProviderBackupImpl0 = new io.github.onograph.backup.CommandProviderBackupImpl();
    int int1 = commandProviderBackupImpl0.getPriority();
    int int2 = commandProviderBackupImpl0.getPriority();
    org.neo4j.cli.Command.CommandType commandType3 = commandProviderBackupImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType4 = commandProviderBackupImpl0.commandType();
    int int5 = commandProviderBackupImpl0.getPriority();
    org.neo4j.cli.Command.CommandType commandType6 = commandProviderBackupImpl0.commandType();
    int int7 = commandProviderBackupImpl0.getPriority();
    int int8 = commandProviderBackupImpl0.getPriority();
    int int9 = commandProviderBackupImpl0.getPriority();
    int int10 = commandProviderBackupImpl0.getPriority();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType6 + "' != '" + org.neo4j.cli.Command.CommandType.ONLINE_BACKUP + "'",
        commandType6.equals(org.neo4j.cli.Command.CommandType.ONLINE_BACKUP));
    org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
  }

  @Test
  public void test1157() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1157");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isSicc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory14.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory14.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory20.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment26 = factory20.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern27 = backupEnvironment26.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress28 = backupEnvironment26.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory11.wihadsBackupEnvironmentFactory(
        socketAddress28);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions30 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory11.miAuthMetaOptions(
        authMetaOptions30);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern32 = factory11.gedtenprDatabaseNamePattern();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(backupEnvironment26);
    org.junit.Assert.assertNotNull(databaseNamePattern27);
    org.junit.Assert.assertNotNull(socketAddress28);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(databaseNamePattern32);
  }

  @Test
  public void test1158() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1158");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    boolean boolean15 = backupEnvironment14.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment14.geicmaOptional();
    java.nio.file.Path path17 = backupEnvironment14.getPbPath();
    java.nio.file.Path path18 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path17);
    java.nio.file.Path path19 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path18);
    boolean boolean20 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path19);
    java.nio.file.Path path21 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path19);
    java.nio.file.Path path22 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path21);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory26.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory26.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory32.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment38 = factory32.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern39 = backupEnvironment38.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress40 = backupEnvironment38.getSocketAddress();
    java.nio.file.Path path41 = backupEnvironment38.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory23.pbPath(path41);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory43.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory46.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory46.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory46.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory52.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory52.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment58 = factory52.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern59 = backupEnvironment58.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress60 = backupEnvironment58.getSocketAddress();
    java.nio.file.Path path61 = backupEnvironment58.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory43.pbPath(path61);
    io.github.onograph.backup.FileMoverService fileMoverService63 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path41, path61);
    java.nio.file.Path path64 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path61);
    io.github.onograph.backup.FileMoverService fileMoverService65 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path21, path64);
    java.nio.file.Path path66 = fileMoverService65.filPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory67.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory71 = factory67.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory73 = factory67.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory75 = factory73.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory78 = factory73.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment79 = factory73.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern80 = backupEnvironment79.getDatabaseNamePattern();
    boolean boolean81 = backupEnvironment79.getIsBftf();
    boolean boolean82 = backupEnvironment79.getIsBftf();
    java.nio.file.Path path83 = backupEnvironment79.getRpPath();
    io.github.onograph.backup.FileMoverService fileMoverService84 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path66, path83);
    java.nio.file.Path path85 = fileMoverService84.filPath();
    java.nio.file.Path path86 = fileMoverService84.filPath();
    org.neo4j.logging.LogProvider logProvider87 = null;
    org.neo4j.io.pagecache.PageCache pageCache88 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer89 = null;
    try {
      io.github.onograph.backup.BackupMetaService backupMetaService90 = new io.github.onograph.backup.BackupMetaService(
          fileSystemAbstraction0, "hi!", path86, logProvider87, pageCache88, pageCacheTracer89);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertNotNull(path22);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(backupEnvironment38);
    org.junit.Assert.assertNotNull(databaseNamePattern39);
    org.junit.Assert.assertNotNull(socketAddress40);
    org.junit.Assert.assertNotNull(path41);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(backupEnvironment58);
    org.junit.Assert.assertNotNull(databaseNamePattern59);
    org.junit.Assert.assertNotNull(socketAddress60);
    org.junit.Assert.assertNotNull(path61);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(fileMoverService63);
    org.junit.Assert.assertNotNull(path64);
    org.junit.Assert.assertNotNull(fileMoverService65);
    org.junit.Assert.assertNotNull(path66);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(factory71);
    org.junit.Assert.assertNotNull(factory73);
    org.junit.Assert.assertNotNull(factory75);
    org.junit.Assert.assertNotNull(factory78);
    org.junit.Assert.assertNotNull(backupEnvironment79);
    org.junit.Assert.assertNotNull(databaseNamePattern80);
    org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    org.junit.Assert.assertNotNull(path83);
    org.junit.Assert.assertNotNull(fileMoverService84);
    org.junit.Assert.assertNotNull(path85);
    org.junit.Assert.assertNotNull(path86);
  }

  @Test
  public void test1159() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1159");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern13 = backupEnvironment12.getDatabaseNamePattern();
    boolean boolean14 = backupEnvironment12.getIsBftf();
    boolean boolean15 = backupEnvironment12.getIsBftf();
    java.nio.file.Path path16 = backupEnvironment12.getRpPath();
    org.neo4j.memory.MemoryTracker memoryTracker17 = backupEnvironment12.getMemoryTracker();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(databaseNamePattern13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(path16);
    org.junit.Assert.assertNotNull(memoryTracker17);
  }

  @Test
  public void test1160() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1160");
    }
    try {
      io.github.onograph.backup.Backup backup2 = io.github.onograph.backup.Backup.froBackup(0, "");
      org.junit.Assert.fail(
          "Expected exception of type java.lang.IllegalArgumentException; message: Port is expected to be positive and less than or equal to 65535 but was: 0");
    } catch (java.lang.IllegalArgumentException e) {
    }
  }

  @Test
  public void test1161() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1161");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory7.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory13.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment19 = factory13.bulBackupEnvironment();
    boolean boolean20 = backupEnvironment19.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional21 = backupEnvironment19.geicmaOptional();
    java.nio.file.Path path22 = backupEnvironment19.getPbPath();
    java.nio.file.Path path23 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path22);
    java.nio.file.Path path24 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path23);
    boolean boolean25 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path24);
    java.nio.file.Path path26 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path24);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory27.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory27.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory27.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory33.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory33.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment39 = factory33.bulBackupEnvironment();
    boolean boolean40 = backupEnvironment39.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional41 = backupEnvironment39.geicmaOptional();
    java.nio.file.Path path42 = backupEnvironment39.getPbPath();
    java.nio.file.Path path43 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path42);
    java.nio.file.Path path44 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path43);
    io.github.onograph.backup.FileMoverService fileMoverService45 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path24, path43);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory4.prPath(path43);
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory47.isCc(false);
    java.nio.file.Path path50 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory47.prPath(path50);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory51.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config55 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory54.config(config55);
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = factory56.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory56.isSicc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern61 = factory56.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory53.databaseNamePattern(
        databaseNamePattern61);
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory46.databaseNamePattern(
        databaseNamePattern61);
    io.github.onograph.backup.BackupEnvironment.Factory factory64 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config65 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory66 = factory64.config(config65);
    io.github.onograph.backup.BackupEnvironment.Factory factory68 = factory66.isRp(true);
    org.neo4j.configuration.Config config69 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = factory68.config(config69);
    io.github.onograph.backup.BackupEnvironment.Factory factory72 = factory68.databaseNamePattern(
        "database.id");
    io.github.onograph.backup.BackupEnvironment.Factory factory73 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory75 = factory73.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions76 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory77 = factory73.miAuthMetaOptions(
        authMetaOptions76);
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = factory77.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory79.isIcc(
        (java.lang.Boolean) false);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern82 = factory79.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory83 = factory68.databaseNamePattern(
        databaseNamePattern82);
    io.github.onograph.backup.BackupEnvironment.Factory factory84 = factory46.databaseNamePattern(
        databaseNamePattern82);
    io.github.onograph.backup.BackupEnvironment.Factory factory86 = factory46.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory88 = factory86.isRp(true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(backupEnvironment19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional21);
    org.junit.Assert.assertNotNull(path22);
    org.junit.Assert.assertNotNull(path23);
    org.junit.Assert.assertNotNull(path24);
    org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    org.junit.Assert.assertNotNull(path26);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(backupEnvironment39);
    org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional41);
    org.junit.Assert.assertNotNull(path42);
    org.junit.Assert.assertNotNull(path43);
    org.junit.Assert.assertNotNull(path44);
    org.junit.Assert.assertNotNull(fileMoverService45);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(databaseNamePattern61);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory64);
    org.junit.Assert.assertNotNull(factory66);
    org.junit.Assert.assertNotNull(factory68);
    org.junit.Assert.assertNotNull(factory70);
    org.junit.Assert.assertNotNull(factory72);
    org.junit.Assert.assertNotNull(factory73);
    org.junit.Assert.assertNotNull(factory75);
    org.junit.Assert.assertNotNull(factory77);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(databaseNamePattern82);
    org.junit.Assert.assertNotNull(factory83);
    org.junit.Assert.assertNotNull(factory84);
    org.junit.Assert.assertNotNull(factory86);
    org.junit.Assert.assertNotNull(factory88);
  }

  @Test
  public void test1162() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1162");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(false);
    org.neo4j.configuration.helpers.SocketAddress socketAddress5 = factory2.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory2.isIcc(
        (java.lang.Boolean) true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNull(socketAddress5);
    org.junit.Assert.assertNotNull(factory7);
  }

  @Test
  public void test1163() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1163");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("hi!");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(false);
    io.github.onograph.backup.Backup backup5 = backup1.isCc(false);
    io.github.onograph.backup.Backup backup7 = backup5.isCc(true);
    java.io.OutputStream outputStream8 = null;
    try {
      io.github.onograph.backup.Backup backup9 = backup7.outputStream(outputStream8);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: outputStream");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
  }

  @Test
  public void test1164() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1164");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup3.isCc(true);
    io.github.onograph.backup.Backup backup7 = backup5.isCc(true);
    io.github.onograph.backup.Backup backup9 = backup7.isBftf(true);
    io.github.onograph.backup.Backup backup11 = backup7.isBftf(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory13.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory13.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory19.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment25 = factory19.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern26 = backupEnvironment25.getDatabaseNamePattern();
    boolean boolean27 = backupEnvironment25.getIsBftf();
    boolean boolean28 = backupEnvironment25.getIsCc();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern29 = backupEnvironment25.getDatabaseNamePattern();
    java.nio.file.Path path30 = backupEnvironment25.getRpPath();
    try {
      io.github.onograph.backup.Backup.BackupRespState backupRespState31 = backup7.bakBackupBackupRespState(
          "", path30);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.RuntimeException; message: *** Error:  3b02b00a-232a-454b-823b-025cc97a58b8");
    } catch (java.lang.RuntimeException e) {
    }
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
    org.junit.Assert.assertNotNull(backup11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(backupEnvironment25);
    org.junit.Assert.assertNotNull(databaseNamePattern26);
    org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    org.junit.Assert.assertNotNull(databaseNamePattern29);
    org.junit.Assert.assertNotNull(path30);
  }

  @Test
  public void test1165() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1165");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.databaseNamePattern(
        "database.id");
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions12 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory9.miAuthMetaOptions(
        authMetaOptions12);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isIcc(
        (java.lang.Boolean) false);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern18 = factory15.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory4.databaseNamePattern(
        databaseNamePattern18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory4.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory4.isIcc(
        (java.lang.Boolean) false);
    org.neo4j.configuration.Config config24 = factory23.gecfConfig();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(databaseNamePattern18);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(config24);
  }

  @Test
  public void test1166() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1166");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.prPath(path5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.shouldPrep(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory6.isRp(true);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions11 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.miAuthMetaOptions(
        authMetaOptions11);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
  }

  @Test
  public void test1167() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1167");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator4.progressMonitorFactory(
        progressMonitorFactory5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.monitors(monitors7);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator8.progressMonitorFactory(
        progressMonitorFactory9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.itraLogProvider(
        logProvider11);
    org.neo4j.monitoring.Monitors monitors13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.monitors(monitors13);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
  }

  @Test
  public void test1168() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1168");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    java.io.PrintStream printStream3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.isIcc(
        (java.lang.Boolean) true);
    java.nio.file.Path path11 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory4.pbPath(path11);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory13.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory13.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory19.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment25 = factory19.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern26 = backupEnvironment25.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress27 = backupEnvironment25.getSocketAddress();
    java.nio.file.Path path28 = backupEnvironment25.getRpPath();
    boolean boolean29 = backupEnvironment25.getIsBftf();
    java.nio.file.Path path30 = backupEnvironment25.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory12.prPath(path30);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory32.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory32.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory38.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment44 = factory38.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern45 = backupEnvironment44.getDatabaseNamePattern();
    boolean boolean46 = backupEnvironment44.getIsBftf();
    boolean boolean47 = backupEnvironment44.getIsBftf();
    java.nio.file.Path path48 = backupEnvironment44.getRpPath();
    io.github.onograph.backup.FileMoverService fileMoverService49 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path30, path48);
    java.nio.file.Path path50 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path30);
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory51.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory51.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory51.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory57.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory57.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment63 = factory57.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern64 = backupEnvironment63.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress65 = backupEnvironment63.getSocketAddress();
    java.nio.file.Path path66 = backupEnvironment63.getRpPath();
    boolean boolean67 = backupEnvironment63.getIsBftf();
    java.nio.file.Path path68 = backupEnvironment63.getRpPath();
    java.nio.file.Path path69 = backupEnvironment63.getRpPath();
    org.neo4j.memory.MemoryTracker memoryTracker70 = backupEnvironment63.getMemoryTracker();
    java.nio.file.Path path71 = backupEnvironment63.getPbPath();
    java.nio.file.Path path72 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path71);
    io.github.onograph.backup.BackupEnvironment.Factory factory73 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory75 = factory73.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory77 = factory73.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = factory73.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory79.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory84 = factory79.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment85 = factory79.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern86 = backupEnvironment85.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress87 = backupEnvironment85.getSocketAddress();
    java.nio.file.Path path88 = backupEnvironment85.getRpPath();
    java.nio.file.Path path89 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path88);
    java.nio.file.Path path90 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path88);
    io.github.onograph.backup.FileMoverService fileMoverService91 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path72, path88);
    org.neo4j.io.layout.DatabaseLayout databaseLayout92 = null;
    try {
      io.github.onograph.backup.GdbRestorer gdbRestorer93 = new io.github.onograph.backup.GdbRestorer(
          fileSystemAbstraction0, false, true, printStream3, path30, path88, databaseLayout92);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(backupEnvironment25);
    org.junit.Assert.assertNotNull(databaseNamePattern26);
    org.junit.Assert.assertNotNull(socketAddress27);
    org.junit.Assert.assertNotNull(path28);
    org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    org.junit.Assert.assertNotNull(path30);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(backupEnvironment44);
    org.junit.Assert.assertNotNull(databaseNamePattern45);
    org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    org.junit.Assert.assertNotNull(path48);
    org.junit.Assert.assertNotNull(fileMoverService49);
    org.junit.Assert.assertNotNull(path50);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(backupEnvironment63);
    org.junit.Assert.assertNotNull(databaseNamePattern64);
    org.junit.Assert.assertNotNull(socketAddress65);
    org.junit.Assert.assertNotNull(path66);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    org.junit.Assert.assertNotNull(path68);
    org.junit.Assert.assertNotNull(path69);
    org.junit.Assert.assertNotNull(memoryTracker70);
    org.junit.Assert.assertNotNull(path71);
    org.junit.Assert.assertNotNull(path72);
    org.junit.Assert.assertNotNull(factory73);
    org.junit.Assert.assertNotNull(factory75);
    org.junit.Assert.assertNotNull(factory77);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(factory84);
    org.junit.Assert.assertNotNull(backupEnvironment85);
    org.junit.Assert.assertNotNull(databaseNamePattern86);
    org.junit.Assert.assertNotNull(socketAddress87);
    org.junit.Assert.assertNotNull(path88);
    org.junit.Assert.assertNotNull(path89);
    org.junit.Assert.assertNotNull(path90);
    org.junit.Assert.assertNotNull(fileMoverService91);
  }

  @Test
  public void test1169() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1169");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker15 = backupEnvironment14.getMemoryTracker();
    boolean boolean16 = backupEnvironment14.getIsRp();
    java.nio.file.Path path17 = backupEnvironment14.getPbPath();
    java.nio.file.Path path18 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path17);
    try {
      backupIOService1.deedForPa(path17);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertNotNull(memoryTracker15);
    org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(path18);
  }

  @Test
  public void test1170() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1170");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.systemNanoClock(
        systemNanoClock7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.itraLogProvider(
        logProvider9);
    org.neo4j.monitoring.Monitors monitors11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator6.monitors(monitors11);
    org.neo4j.logging.LogProvider logProvider13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.itraLogProvider(
        logProvider13);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator12.fFileSystemAbstraction(
        fileSystemAbstraction15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    io.github.onograph.backup.BackupRunner.Generator generator18 = generator16.itraLogProvider(
        logProvider17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.backup.BackupRunner.Generator generator20 = generator16.monitors(monitors19);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
    org.junit.Assert.assertNotNull(generator18);
    org.junit.Assert.assertNotNull(generator20);
  }

  @Test
  public void test1171() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1171");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.prPath(path5);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment backupEnvironment9 = factory8.bulBackupEnvironment();
    java.nio.file.Path path10 = backupEnvironment9.getRpPath();
    try {
      backupIOService1.deedForPa(path10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(backupEnvironment9);
    org.junit.Assert.assertNotNull(path10);
  }

  @Test
  public void test1172() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1172");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern13 = backupEnvironment12.getDatabaseNamePattern();
    boolean boolean14 = backupEnvironment12.getIsBftf();
    boolean boolean15 = backupEnvironment12.getIsCc();
    org.neo4j.configuration.helpers.SocketAddress socketAddress16 = backupEnvironment12.getSocketAddress();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(databaseNamePattern13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(socketAddress16);
  }

  @Test
  public void test1173() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1173");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    org.neo4j.configuration.helpers.SocketAddress socketAddress9 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress9);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory4.wihadsBackupEnvironmentFactory(
        (int) (short) -1, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory4.wihadsBackupEnvironmentFactory(
        0, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config18 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.config(config18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isRp(true);
    org.neo4j.configuration.Config config22 = factory19.gecfConfig();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction23 = null;
    org.neo4j.memory.MemoryTracker memoryTracker24 = null;
    org.neo4j.io.pagecache.PageCache pageCache25 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager26 = new io.github.onograph.backup.BackupRestorationManager(
        config22, fileSystemAbstraction23, memoryTracker24, pageCache25);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory4.config(config22);
    org.neo4j.consistency.checking.full.ConsistencyFlags consistencyFlags28 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction29 = null;
    org.neo4j.logging.LogProvider logProvider30 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory31.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory31.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory31.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory37.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment43 = factory37.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern44 = backupEnvironment43.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress45 = backupEnvironment43.getSocketAddress();
    java.nio.file.Path path46 = backupEnvironment43.getRpPath();
    java.nio.file.Path path47 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path46);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory48 = null;
    io.github.onograph.backup.BackupVerificationServiceImpl backupVerificationServiceImpl49 = new io.github.onograph.backup.BackupVerificationServiceImpl(
        config22, consistencyFlags28, fileSystemAbstraction29, logProvider30, path46,
        progressMonitorFactory48);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction50 = null;
    io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl51 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler52 = null;
    org.neo4j.logging.LogProvider logProvider53 = null;
    org.neo4j.monitoring.Monitors monitors54 = null;
    org.neo4j.io.pagecache.PageCache pageCache55 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer56 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock57 = null;
    try {
      io.github.onograph.backup.RemoteBackupManager remoteBackupManager58 = new io.github.onograph.backup.RemoteBackupManager(
          config22, fileSystemAbstraction50, lifecycleCatchupManagerImpl51, jobScheduler52,
          logProvider53, monitors54, pageCache55, pageCacheTracer56, systemNanoClock57);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(config22);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(backupEnvironment43);
    org.junit.Assert.assertNotNull(databaseNamePattern44);
    org.junit.Assert.assertNotNull(socketAddress45);
    org.junit.Assert.assertNotNull(path46);
    org.junit.Assert.assertNotNull(path47);
  }

  @Test
  public void test1174() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1174");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupMetadataRepository backupMetadataRepository1 = new io.github.onograph.backup.BackupMetadataRepository(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern15 = backupEnvironment14.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress16 = backupEnvironment14.getSocketAddress();
    java.nio.file.Path path17 = backupEnvironment14.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory18.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory18.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory18.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory24.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment30 = factory24.bulBackupEnvironment();
    boolean boolean31 = backupEnvironment30.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional32 = backupEnvironment30.geicmaOptional();
    java.nio.file.Path path33 = backupEnvironment30.getPbPath();
    java.nio.file.Path path34 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path33);
    java.nio.file.Path path35 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path34);
    boolean boolean36 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path35);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory37.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory37.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory43.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory43.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment49 = factory43.bulBackupEnvironment();
    boolean boolean50 = backupEnvironment49.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional51 = backupEnvironment49.geicmaOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional52 = backupEnvironment49.geicmaOptional();
    java.nio.file.Path path53 = backupEnvironment49.getPbPath();
    java.nio.file.Path path54 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path53);
    io.github.onograph.backup.FileMoverService fileMoverService55 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path35, path54);
    io.github.onograph.backup.FileMoverService fileMoverService56 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path17, path35);
    java.lang.String[] strArray59 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
    boolean boolean61 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList60, strArray59);
    try {
      backupMetadataRepository1.wrtForPaLi(path17, (java.util.List<java.lang.String>) strList60);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertNotNull(databaseNamePattern15);
    org.junit.Assert.assertNotNull(socketAddress16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(backupEnvironment30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional32);
    org.junit.Assert.assertNotNull(path33);
    org.junit.Assert.assertNotNull(path34);
    org.junit.Assert.assertNotNull(path35);
    org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(backupEnvironment49);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional51);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional52);
    org.junit.Assert.assertNotNull(path53);
    org.junit.Assert.assertNotNull(path54);
    org.junit.Assert.assertNotNull(fileMoverService55);
    org.junit.Assert.assertNotNull(fileMoverService56);
    org.junit.Assert.assertNotNull(strArray59);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
  }

  @Test
  public void test1175() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1175");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    org.neo4j.memory.MemoryTracker memoryTracker14 = backupEnvironment12.getMemoryTracker();
    java.nio.file.Path path15 = backupEnvironment12.getRpPath();
    org.neo4j.configuration.helpers.SocketAddress socketAddress16 = backupEnvironment12.getSocketAddress();
    java.nio.file.Path path17 = backupEnvironment12.getPbPath();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(memoryTracker14);
    org.junit.Assert.assertNotNull(path15);
    org.junit.Assert.assertNotNull(socketAddress16);
    org.junit.Assert.assertNotNull(path17);
  }

  @Test
  public void test1176() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1176");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.monitoring.Monitors monitors3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator0.monitors(monitors3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator0.uLogProvider(
        logProvider5);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
  }

  @Test
  public void test1177() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1177");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = factory2.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory2.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    java.nio.file.Path path11 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory8.prPath(path11);
    java.nio.file.Path path13 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.prPath(path13);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory15.isCc(false);
    java.nio.file.Path path18 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory15.prPath(path18);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config21 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.config(config21);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory22.isRp(true);
    org.neo4j.configuration.Config config25 = factory22.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory15.config(config25);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory14.config(config25);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory7.config(config25);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config30 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory29.config(config30);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory31.isRp(true);
    org.neo4j.configuration.Config config34 = factory31.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory31.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.isCc(false);
    java.nio.file.Path path40 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory37.prPath(path40);
    java.nio.file.Path path42 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory41.prPath(path42);
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory44.isCc(false);
    java.nio.file.Path path47 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory44.prPath(path47);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config50 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory49.config(config50);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory51.isRp(true);
    org.neo4j.configuration.Config config54 = factory51.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory44.config(config54);
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory43.config(config54);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory36.config(config54);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction58 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory59.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory59.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory65 = factory59.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = factory65.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = factory65.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment71 = factory65.bulBackupEnvironment();
    boolean boolean72 = backupEnvironment71.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional73 = backupEnvironment71.geicmaOptional();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern74 = backupEnvironment71.getDatabaseNamePattern();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional75 = backupEnvironment71.geicmaOptional();
    org.neo4j.memory.MemoryTracker memoryTracker76 = backupEnvironment71.getMemoryTracker();
    org.neo4j.io.pagecache.PageCache pageCache77 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager78 = new io.github.onograph.backup.BackupRestorationManager(
        config54, fileSystemAbstraction58, memoryTracker76, pageCache77);
    io.github.onograph.backup.BackupEnvironment.Factory factory79 = factory28.config(config54);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory79.isCc(true);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(config5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(config25);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(config34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(config54);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory65);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(factory70);
    org.junit.Assert.assertNotNull(backupEnvironment71);
    org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional73);
    org.junit.Assert.assertNotNull(databaseNamePattern74);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional75);
    org.junit.Assert.assertNotNull(memoryTracker76);
    org.junit.Assert.assertNotNull(factory79);
    org.junit.Assert.assertNotNull(factory81);
  }

  @Test
  public void test1178() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1178");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory5.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory8.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory8.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory14.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment20 = factory14.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern21 = backupEnvironment20.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress22 = backupEnvironment20.getSocketAddress();
    java.nio.file.Path path23 = backupEnvironment20.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory5.pbPath(path23);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory28.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory28.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory28.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory34.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory34.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment40 = factory34.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern41 = backupEnvironment40.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress42 = backupEnvironment40.getSocketAddress();
    java.nio.file.Path path43 = backupEnvironment40.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory25.pbPath(path43);
    io.github.onograph.backup.FileMoverService fileMoverService45 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path23, path43);
    java.nio.file.Path path46 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path43);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction47 = null;
    io.github.onograph.backup.FileMover fileMover48 = new io.github.onograph.backup.FileMover(
        fileSystemAbstraction47);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory49.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory49.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory49.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory55.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory55.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment61 = factory55.bulBackupEnvironment();
    boolean boolean62 = backupEnvironment61.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional63 = backupEnvironment61.geicmaOptional();
    java.nio.file.Path path64 = backupEnvironment61.getPbPath();
    java.nio.file.Path path65 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path64);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream66 = fileMover48._trrfrmnStream(
        path64);
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory67.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory71 = factory67.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory73 = factory67.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory75 = factory73.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory78 = factory73.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment79 = factory73.bulBackupEnvironment();
    boolean boolean80 = backupEnvironment79.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional81 = backupEnvironment79.geicmaOptional();
    java.nio.file.Path path82 = backupEnvironment79.getPbPath();
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream83 = fileMover48._trrfrmnStream(
        path82);
    io.github.onograph.backup.FileMoverService fileMoverService84 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path43, path82);
    io.github.onograph.backup.BackupEnvironment.Factory factory85 = factory4.prPath(path82);
    io.github.onograph.backup.BackupEnvironment.Factory factory87 = factory4.isRp(false);
    org.neo4j.configuration.Config config88 = factory87.gecfConfig();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(backupEnvironment20);
    org.junit.Assert.assertNotNull(databaseNamePattern21);
    org.junit.Assert.assertNotNull(socketAddress22);
    org.junit.Assert.assertNotNull(path23);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(backupEnvironment40);
    org.junit.Assert.assertNotNull(databaseNamePattern41);
    org.junit.Assert.assertNotNull(socketAddress42);
    org.junit.Assert.assertNotNull(path43);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(fileMoverService45);
    org.junit.Assert.assertNotNull(path46);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(backupEnvironment61);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional63);
    org.junit.Assert.assertNotNull(path64);
    org.junit.Assert.assertNotNull(path65);
    org.junit.Assert.assertNotNull(fileMoverServiceStream66);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(factory71);
    org.junit.Assert.assertNotNull(factory73);
    org.junit.Assert.assertNotNull(factory75);
    org.junit.Assert.assertNotNull(factory78);
    org.junit.Assert.assertNotNull(backupEnvironment79);
    org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional81);
    org.junit.Assert.assertNotNull(path82);
    org.junit.Assert.assertNotNull(fileMoverServiceStream83);
    org.junit.Assert.assertNotNull(fileMoverService84);
    org.junit.Assert.assertNotNull(factory85);
    org.junit.Assert.assertNotNull(factory87);
    org.junit.Assert.assertNotNull(config88);
  }

  @Test
  public void test1179() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1179");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator4.progressMonitorFactory(
        progressMonitorFactory5);
    org.neo4j.monitoring.Monitors monitors7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.monitors(monitors7);
    org.neo4j.time.SystemNanoClock systemNanoClock9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.systemNanoClock(
        systemNanoClock9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.uLogProvider(
        logProvider11);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator10.progressMonitorFactory(
        progressMonitorFactory13);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
  }

  @Test
  public void test1180() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1180");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.GdbIdRepo gdbIdRepo1 = new io.github.onograph.backup.GdbIdRepo(
        fileSystemAbstraction0);
    org.neo4j.kernel.database.DatabaseId databaseId2 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction3 = null;
    io.github.onograph.backup.FileMover fileMover4 = new io.github.onograph.backup.FileMover(
        fileSystemAbstraction3);
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory5.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory8.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory8.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory14.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment20 = factory14.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern21 = backupEnvironment20.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress22 = backupEnvironment20.getSocketAddress();
    java.nio.file.Path path23 = backupEnvironment20.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory5.pbPath(path23);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory28.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory28.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory28.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory34.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory34.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment40 = factory34.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern41 = backupEnvironment40.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress42 = backupEnvironment40.getSocketAddress();
    java.nio.file.Path path43 = backupEnvironment40.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory25.pbPath(path43);
    io.github.onograph.backup.FileMoverService fileMoverService45 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path23, path43);
    java.nio.file.Path path46 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path43);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction47 = null;
    io.github.onograph.backup.FileMover fileMover48 = new io.github.onograph.backup.FileMover(
        fileSystemAbstraction47);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory51 = factory49.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory49.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory49.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory55.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory55.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment61 = factory55.bulBackupEnvironment();
    boolean boolean62 = backupEnvironment61.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional63 = backupEnvironment61.geicmaOptional();
    java.nio.file.Path path64 = backupEnvironment61.getPbPath();
    java.nio.file.Path path65 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path64);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream66 = fileMover48._trrfrmnStream(
        path64);
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory67.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory71 = factory67.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory73 = factory67.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory75 = factory73.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory78 = factory73.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment79 = factory73.bulBackupEnvironment();
    boolean boolean80 = backupEnvironment79.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional81 = backupEnvironment79.geicmaOptional();
    java.nio.file.Path path82 = backupEnvironment79.getPbPath();
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream83 = fileMover48._trrfrmnStream(
        path82);
    io.github.onograph.backup.FileMoverService fileMoverService84 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path43, path82);
    java.util.stream.Stream<io.github.onograph.backup.FileMoverService> fileMoverServiceStream85 = fileMover4._trrfrmnStream(
        path82);
    java.nio.file.Path path86 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path82);
    try {
      gdbIdRepo1.wrdaiForDaPa(databaseId2, path82);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(backupEnvironment20);
    org.junit.Assert.assertNotNull(databaseNamePattern21);
    org.junit.Assert.assertNotNull(socketAddress22);
    org.junit.Assert.assertNotNull(path23);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(backupEnvironment40);
    org.junit.Assert.assertNotNull(databaseNamePattern41);
    org.junit.Assert.assertNotNull(socketAddress42);
    org.junit.Assert.assertNotNull(path43);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(fileMoverService45);
    org.junit.Assert.assertNotNull(path46);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory51);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(backupEnvironment61);
    org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional63);
    org.junit.Assert.assertNotNull(path64);
    org.junit.Assert.assertNotNull(path65);
    org.junit.Assert.assertNotNull(fileMoverServiceStream66);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(factory71);
    org.junit.Assert.assertNotNull(factory73);
    org.junit.Assert.assertNotNull(factory75);
    org.junit.Assert.assertNotNull(factory78);
    org.junit.Assert.assertNotNull(backupEnvironment79);
    org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional81);
    org.junit.Assert.assertNotNull(path82);
    org.junit.Assert.assertNotNull(fileMoverServiceStream83);
    org.junit.Assert.assertNotNull(fileMoverService84);
    org.junit.Assert.assertNotNull(fileMoverServiceStream85);
    org.junit.Assert.assertNotNull(path86);
  }

  @Test
  public void test1181() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1181");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.miAuthMetaOptions(
        authMetaOptions7);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory8.isSicc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.databaseNamePattern(
        "database.id");
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.shouldPrep(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.isRp(false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
  }

  @Test
  public void test1182() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1182");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isSicc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = factory13.isIcc(
        (java.lang.Boolean) false);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory17);
  }

  @Test
  public void test1183() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1183");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.logging.LogProvider logProvider7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.uLogProvider(
        logProvider7);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.fFileSystemAbstraction(
        fileSystemAbstraction9);
    org.neo4j.time.SystemNanoClock systemNanoClock11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.systemNanoClock(
        systemNanoClock11);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.fFileSystemAbstraction(
        fileSystemAbstraction13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator14.itraLogProvider(
        logProvider15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    io.github.onograph.backup.BackupRunner.Generator generator18 = generator16.uLogProvider(
        logProvider17);
    io.github.onograph.backup.BackupRunner backupRunner19 = generator18.bulBackupRunner();
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
    org.junit.Assert.assertNotNull(generator18);
    org.junit.Assert.assertNotNull(backupRunner19);
  }

  @Test
  public void test1184() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1184");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.time.SystemNanoClock systemNanoClock5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.systemNanoClock(
        systemNanoClock5);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator2.progressMonitorFactory(
        progressMonitorFactory7);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator8.progressMonitorFactory(
        progressMonitorFactory9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator8.uLogProvider(
        logProvider11);
    io.github.onograph.backup.BackupRunner backupRunner13 = generator8.bulBackupRunner();
    io.github.onograph.backup.BackupRunner backupRunner14 = generator8.bulBackupRunner();
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(backupRunner13);
    org.junit.Assert.assertNotNull(backupRunner14);
  }

  @Test
  public void test1185() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1185");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupMetadataRepository backupMetadataRepository1 = new io.github.onograph.backup.BackupMetadataRepository(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    boolean boolean15 = backupEnvironment14.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment14.geicmaOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional17 = backupEnvironment14.geicmaOptional();
    boolean boolean18 = backupEnvironment14.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional19 = backupEnvironment14.geicmaOptional();
    java.nio.file.Path path20 = backupEnvironment14.getRpPath();
    java.nio.file.Path path21 = backupEnvironment14.getPbPath();
    java.lang.String[] strArray24 = new java.lang.String[]{"hi!", "hi!"};
    java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
    boolean boolean26 = java.util.Collections.addAll(
        (java.util.Collection<java.lang.String>) strList25, strArray24);
    try {
      backupMetadataRepository1.wrtForPaLi(path21, (java.util.List<java.lang.String>) strList25);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertNotNull(strArray24);
    org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
  }

  @Test
  public void test1186() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1186");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isSicc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory14.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory14.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory20.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory20.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment26 = factory20.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern27 = backupEnvironment26.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress28 = backupEnvironment26.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory11.wihadsBackupEnvironmentFactory(
        socketAddress28);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions30 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory11.miAuthMetaOptions(
        authMetaOptions30);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory32.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = factory32.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory38.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory43.isSicc(
        (java.lang.Boolean) false);
    org.neo4j.configuration.Config config46 = factory43.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory11.config(config46);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory48.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory48.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory48.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory54.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory54.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment60 = factory54.bulBackupEnvironment();
    boolean boolean61 = backupEnvironment60.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional62 = backupEnvironment60.geicmaOptional();
    java.nio.file.Path path63 = backupEnvironment60.getPbPath();
    boolean boolean64 = backupEnvironment60.getIsBftf();
    org.neo4j.configuration.helpers.SocketAddress socketAddress65 = backupEnvironment60.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory66 = factory11.wihadsBackupEnvironmentFactory(
        socketAddress65);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(backupEnvironment26);
    org.junit.Assert.assertNotNull(databaseNamePattern27);
    org.junit.Assert.assertNotNull(socketAddress28);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(config46);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(backupEnvironment60);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional62);
    org.junit.Assert.assertNotNull(path63);
    org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    org.junit.Assert.assertNotNull(socketAddress65);
    org.junit.Assert.assertNotNull(factory66);
  }

  @Test
  public void test1187() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1187");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.logging.LogProvider logProvider7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.uLogProvider(
        logProvider7);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.fFileSystemAbstraction(
        fileSystemAbstraction9);
    org.neo4j.time.SystemNanoClock systemNanoClock11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.systemNanoClock(
        systemNanoClock11);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.fFileSystemAbstraction(
        fileSystemAbstraction13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator14.itraLogProvider(
        logProvider15);
    org.neo4j.logging.LogProvider logProvider17 = null;
    io.github.onograph.backup.BackupRunner.Generator generator18 = generator14.itraLogProvider(
        logProvider17);
    org.neo4j.monitoring.Monitors monitors19 = null;
    io.github.onograph.backup.BackupRunner.Generator generator20 = generator18.monitors(monitors19);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
    org.junit.Assert.assertNotNull(generator18);
    org.junit.Assert.assertNotNull(generator20);
  }

  @Test
  public void test1188() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1188");
    }
    java.nio.file.Path path0 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory1 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory3 = factory1.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory10.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment16 = factory10.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern17 = backupEnvironment16.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress18 = backupEnvironment16.getSocketAddress();
    java.nio.file.Path path19 = backupEnvironment16.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory1.pbPath(path19);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory24.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory24.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory30.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory30.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment36 = factory30.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern37 = backupEnvironment36.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress38 = backupEnvironment36.getSocketAddress();
    java.nio.file.Path path39 = backupEnvironment36.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory21.pbPath(path39);
    io.github.onograph.backup.FileMoverService fileMoverService41 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path19, path39);
    boolean boolean42 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path19);
    io.github.onograph.backup.FileMoverService fileMoverService43 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path0, path19);
    org.junit.Assert.assertNotNull(factory1);
    org.junit.Assert.assertNotNull(factory3);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(backupEnvironment16);
    org.junit.Assert.assertNotNull(databaseNamePattern17);
    org.junit.Assert.assertNotNull(socketAddress18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(backupEnvironment36);
    org.junit.Assert.assertNotNull(databaseNamePattern37);
    org.junit.Assert.assertNotNull(socketAddress38);
    org.junit.Assert.assertNotNull(path39);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(fileMoverService41);
    org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    org.junit.Assert.assertNotNull(fileMoverService43);
  }

  @Test
  public void test1189() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1189");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("hi!");
    io.github.onograph.backup.Backup backup3 = backup1.isBftf(true);
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
  }

  @Test
  public void test1190() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1190");
    }
    io.github.onograph.backup.Backup backup2 = io.github.onograph.backup.Backup.froBackup(1, "");
    org.junit.Assert.assertNotNull(backup2);
  }

  @Test
  public void test1191() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1191");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    java.nio.file.Path path15 = backupEnvironment12.getPbPath();
    java.nio.file.Path path16 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path15);
    java.nio.file.Path path17 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path16);
    boolean boolean18 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path17);
    java.nio.file.Path path19 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path17);
    java.nio.file.Path path20 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path19);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory24.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory24.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory30.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory30.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment36 = factory30.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern37 = backupEnvironment36.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress38 = backupEnvironment36.getSocketAddress();
    java.nio.file.Path path39 = backupEnvironment36.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory21.pbPath(path39);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory41.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory44.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory44.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory44.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory50.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory50.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment56 = factory50.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern57 = backupEnvironment56.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress58 = backupEnvironment56.getSocketAddress();
    java.nio.file.Path path59 = backupEnvironment56.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory41.pbPath(path59);
    io.github.onograph.backup.FileMoverService fileMoverService61 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path39, path59);
    java.nio.file.Path path62 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path59);
    io.github.onograph.backup.FileMoverService fileMoverService63 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path19, path62);
    java.nio.file.Path path64 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path19);
    java.nio.file.Path path65 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path64);
    java.nio.file.Path path66 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path65);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(path15);
    org.junit.Assert.assertNotNull(path16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(backupEnvironment36);
    org.junit.Assert.assertNotNull(databaseNamePattern37);
    org.junit.Assert.assertNotNull(socketAddress38);
    org.junit.Assert.assertNotNull(path39);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(backupEnvironment56);
    org.junit.Assert.assertNotNull(databaseNamePattern57);
    org.junit.Assert.assertNotNull(socketAddress58);
    org.junit.Assert.assertNotNull(path59);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(fileMoverService61);
    org.junit.Assert.assertNotNull(path62);
    org.junit.Assert.assertNotNull(fileMoverService63);
    org.junit.Assert.assertNotNull(path64);
    org.junit.Assert.assertNotNull(path65);
    org.junit.Assert.assertNotNull(path66);
  }

  @Test
  public void test1192() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1192");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.monitoring.Monitors monitors3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator0.monitors(monitors3);
    org.neo4j.time.SystemNanoClock systemNanoClock5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator0.systemNanoClock(
        systemNanoClock5);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
  }

  @Test
  public void test1193() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1193");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup3.isCc(true);
    io.github.onograph.backup.Backup backup7 = backup3.isBftf(false);
    io.github.onograph.backup.Backup backup9 = backup7.isBftf(true);
    io.github.onograph.backup.Backup backup11 = backup7.isCc(false);
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
    org.junit.Assert.assertNotNull(backup11);
  }

  @Test
  public void test1194() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1194");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    boolean boolean15 = backupEnvironment14.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment14.geicmaOptional();
    java.nio.file.Path path17 = backupEnvironment14.getPbPath();
    java.nio.file.Path path18 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path17);
    java.nio.file.Path path19 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path18);
    boolean boolean20 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path19);
    java.nio.file.Path path21 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path19);
    java.nio.file.Path path22 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path21);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory26.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory26.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory26.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory32.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment38 = factory32.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern39 = backupEnvironment38.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress40 = backupEnvironment38.getSocketAddress();
    java.nio.file.Path path41 = backupEnvironment38.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory23.pbPath(path41);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory43.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory46.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory46.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory46.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory52.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory52.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment58 = factory52.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern59 = backupEnvironment58.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress60 = backupEnvironment58.getSocketAddress();
    java.nio.file.Path path61 = backupEnvironment58.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory43.pbPath(path61);
    io.github.onograph.backup.FileMoverService fileMoverService63 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path41, path61);
    java.nio.file.Path path64 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path61);
    io.github.onograph.backup.FileMoverService fileMoverService65 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path21, path64);
    try {
      backupIOService1.deedForPa(path21);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    org.junit.Assert.assertNotNull(path21);
    org.junit.Assert.assertNotNull(path22);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(backupEnvironment38);
    org.junit.Assert.assertNotNull(databaseNamePattern39);
    org.junit.Assert.assertNotNull(socketAddress40);
    org.junit.Assert.assertNotNull(path41);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(backupEnvironment58);
    org.junit.Assert.assertNotNull(databaseNamePattern59);
    org.junit.Assert.assertNotNull(socketAddress60);
    org.junit.Assert.assertNotNull(path61);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(fileMoverService63);
    org.junit.Assert.assertNotNull(path64);
    org.junit.Assert.assertNotNull(fileMoverService65);
  }

  @Test
  public void test1195() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1195");
    }
    io.github.onograph.backup.Backup backup2 = io.github.onograph.backup.Backup.froBackup((int) '#',
        "");
    io.github.onograph.backup.Backup backup4 = backup2.isCc(true);
    org.junit.Assert.assertNotNull(backup2);
    org.junit.Assert.assertNotNull(backup4);
  }

  @Test
  public void test1196() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1196");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    java.nio.file.Path path3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.prPath(path3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isSicc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory12.isRp(false);
    java.nio.file.Path path17 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory16.prPath(path17);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern19 = factory18.gedtenprDatabaseNamePattern();
    org.neo4j.configuration.Config config20 = factory18.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory11.config(config20);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory0.config(config20);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction23 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory24.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = factory24.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory30.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory30.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment36 = factory30.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker37 = backupEnvironment36.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern38 = backupEnvironment36.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress39 = backupEnvironment36.getSocketAddress();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern40 = backupEnvironment36.getDatabaseNamePattern();
    org.neo4j.memory.MemoryTracker memoryTracker41 = backupEnvironment36.getMemoryTracker();
    org.neo4j.io.pagecache.PageCache pageCache42 = null;
    io.github.onograph.backup.BackupRestorationManager backupRestorationManager43 = new io.github.onograph.backup.BackupRestorationManager(
        config20, fileSystemAbstraction23, memoryTracker41, pageCache42);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction44 = null;
    io.github.onograph.cluster.raft.module.cuprot.LifecycleCatchupManagerImpl lifecycleCatchupManagerImpl45 = null;
    org.neo4j.scheduler.JobScheduler jobScheduler46 = null;
    org.neo4j.logging.LogProvider logProvider47 = null;
    org.neo4j.monitoring.Monitors monitors48 = null;
    org.neo4j.io.pagecache.PageCache pageCache49 = null;
    org.neo4j.io.pagecache.tracing.PageCacheTracer pageCacheTracer50 = null;
    org.neo4j.time.SystemNanoClock systemNanoClock51 = null;
    try {
      io.github.onograph.backup.RemoteBackupManager remoteBackupManager52 = new io.github.onograph.backup.RemoteBackupManager(
          config20, fileSystemAbstraction44, lifecycleCatchupManagerImpl45, jobScheduler46,
          logProvider47, monitors48, pageCache49, pageCacheTracer50, systemNanoClock51);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(databaseNamePattern19);
    org.junit.Assert.assertNotNull(config20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(backupEnvironment36);
    org.junit.Assert.assertNotNull(memoryTracker37);
    org.junit.Assert.assertNotNull(databaseNamePattern38);
    org.junit.Assert.assertNotNull(socketAddress39);
    org.junit.Assert.assertNotNull(databaseNamePattern40);
    org.junit.Assert.assertNotNull(memoryTracker41);
  }

  @Test
  public void test1197() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1197");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = factory2.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory2.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.databaseNamePattern(
        "database.id");
    org.neo4j.configuration.helpers.SocketAddress socketAddress10 = factory9.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory9.wihadsBackupEnvironmentFactory(
        0, "database.id");
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(config5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNull(socketAddress10);
    org.junit.Assert.assertNotNull(factory13);
  }

  @Test
  public void test1198() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1198");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.GdbIdRepo gdbIdRepo1 = new io.github.onograph.backup.GdbIdRepo(
        fileSystemAbstraction0);
    org.neo4j.kernel.database.DatabaseId databaseId2 = null;
    java.nio.file.Path path3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory4.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory10.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment16 = factory10.bulBackupEnvironment();
    boolean boolean17 = backupEnvironment16.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional18 = backupEnvironment16.geicmaOptional();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern19 = backupEnvironment16.getDatabaseNamePattern();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional20 = backupEnvironment16.geicmaOptional();
    org.neo4j.memory.MemoryTracker memoryTracker21 = backupEnvironment16.getMemoryTracker();
    boolean boolean22 = backupEnvironment16.getIsRp();
    java.nio.file.Path path23 = backupEnvironment16.getPbPath();
    java.nio.file.Path path24 = backupEnvironment16.getPbPath();
    io.github.onograph.backup.FileMoverService fileMoverService25 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path3, path24);
    try {
      gdbIdRepo1.wrdaiForDaPa(databaseId2, path24);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(backupEnvironment16);
    org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional18);
    org.junit.Assert.assertNotNull(databaseNamePattern19);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional20);
    org.junit.Assert.assertNotNull(memoryTracker21);
    org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    org.junit.Assert.assertNotNull(path23);
    org.junit.Assert.assertNotNull(path24);
    org.junit.Assert.assertNotNull(fileMoverService25);
  }

  @Test
  public void test1199() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1199");
    }
    io.github.onograph.backup.CommandProviderGdbRestorerCommandImpl commandProviderGdbRestorerCommandImpl0 = new io.github.onograph.backup.CommandProviderGdbRestorerCommandImpl();
    int int1 = commandProviderGdbRestorerCommandImpl0.getPriority();
    int int2 = commandProviderGdbRestorerCommandImpl0.getPriority();
    org.neo4j.cli.Command.CommandType commandType3 = commandProviderGdbRestorerCommandImpl0.commandType();
    org.neo4j.cli.Command.CommandType commandType4 = commandProviderGdbRestorerCommandImpl0.commandType();
    int int5 = commandProviderGdbRestorerCommandImpl0.getPriority();
    org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    org.junit.Assert.assertTrue(
        "'" + commandType3 + "' != '" + org.neo4j.cli.Command.CommandType.RESTORE_DB + "'",
        commandType3.equals(org.neo4j.cli.Command.CommandType.RESTORE_DB));
    org.junit.Assert.assertTrue(
        "'" + commandType4 + "' != '" + org.neo4j.cli.Command.CommandType.RESTORE_DB + "'",
        commandType4.equals(org.neo4j.cli.Command.CommandType.RESTORE_DB));
    org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
  }

  @Test
  public void test1200() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1200");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.GdbIdRepo gdbIdRepo1 = new io.github.onograph.backup.GdbIdRepo(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory2.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory2.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = factory8.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory8.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment14 = factory8.bulBackupEnvironment();
    boolean boolean15 = backupEnvironment14.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment14.geicmaOptional();
    java.nio.file.Path path17 = backupEnvironment14.getPbPath();
    java.nio.file.Path path18 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path17);
    java.nio.file.Path path19 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path18);
    java.nio.file.Path path20 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path18);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config22 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.config(config22);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isRp(true);
    org.neo4j.configuration.Config config26 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.config(config26);
    org.neo4j.configuration.helpers.SocketAddress socketAddress28 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory25.wihadsBackupEnvironmentFactory(
        socketAddress28);
    org.neo4j.configuration.helpers.SocketAddress socketAddress30 = factory25.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory25.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment backupEnvironment35 = factory34.bulBackupEnvironment();
    java.nio.file.Path path36 = backupEnvironment35.getPbPath();
    io.github.onograph.backup.FileMoverService fileMoverService37 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path20, path36);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory38.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory38.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory44.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory44.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment50 = factory44.bulBackupEnvironment();
    boolean boolean51 = backupEnvironment50.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional52 = backupEnvironment50.geicmaOptional();
    java.nio.file.Path path53 = backupEnvironment50.getPbPath();
    boolean boolean54 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path53);
    io.github.onograph.backup.FileMoverService fileMoverService55 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path20, path53);
    try {
      java.util.Optional<org.neo4j.kernel.database.DatabaseId> databaseIdOptional56 = gdbIdRepo1.reddtaiOptional(
          path20);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(backupEnvironment14);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(path18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNull(socketAddress30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(backupEnvironment35);
    org.junit.Assert.assertNotNull(path36);
    org.junit.Assert.assertNotNull(fileMoverService37);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(backupEnvironment50);
    org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional52);
    org.junit.Assert.assertNotNull(path53);
    org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    org.junit.Assert.assertNotNull(fileMoverService55);
  }

  @Test
  public void test1201() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1201");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup3.isCc(true);
    io.github.onograph.backup.Backup backup7 = backup3.isBftf(false);
    io.github.onograph.backup.Backup backup9 = backup7.isCc(true);
    io.github.onograph.backup.Backup backup11 = backup7.isCc(true);
    io.github.onograph.backup.Backup backup13 = backup11.isCc(false);
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
    org.junit.Assert.assertNotNull(backup11);
    org.junit.Assert.assertNotNull(backup13);
  }

  @Test
  public void test1202() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1202");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.time.SystemNanoClock systemNanoClock7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.systemNanoClock(
        systemNanoClock7);
    org.neo4j.logging.LogProvider logProvider9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.itraLogProvider(
        logProvider9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.uLogProvider(
        logProvider11);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator10.fFileSystemAbstraction(
        fileSystemAbstraction13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator10.itraLogProvider(
        logProvider15);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    io.github.onograph.backup.BackupRunner.Generator generator18 = generator16.fFileSystemAbstraction(
        fileSystemAbstraction17);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
    org.junit.Assert.assertNotNull(generator18);
  }

  @Test
  public void test1203() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1203");
    }
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction0 = null;
    io.github.onograph.backup.BackupIOService backupIOService1 = new io.github.onograph.backup.BackupIOService(
        fileSystemAbstraction0);
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory5.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory5.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory5.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory11.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment17 = factory11.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern18 = backupEnvironment17.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress19 = backupEnvironment17.getSocketAddress();
    java.nio.file.Path path20 = backupEnvironment17.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory2.pbPath(path20);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory22.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory25.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory25.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory31.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory31.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment37 = factory31.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern38 = backupEnvironment37.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress39 = backupEnvironment37.getSocketAddress();
    java.nio.file.Path path40 = backupEnvironment37.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory22.pbPath(path40);
    io.github.onograph.backup.FileMoverService fileMoverService42 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path20, path40);
    boolean boolean43 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path20);
    java.nio.file.Path path44 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path20);
    try {
      boolean boolean45 = backupIOService1.isExsForPa(path44);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: null");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(backupEnvironment17);
    org.junit.Assert.assertNotNull(databaseNamePattern18);
    org.junit.Assert.assertNotNull(socketAddress19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(backupEnvironment37);
    org.junit.Assert.assertNotNull(databaseNamePattern38);
    org.junit.Assert.assertNotNull(socketAddress39);
    org.junit.Assert.assertNotNull(path40);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(fileMoverService42);
    org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    org.junit.Assert.assertNotNull(path44);
  }

  @Test
  public void test1204() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1204");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isRp(true);
    org.neo4j.configuration.Config config5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.config(config5);
    org.neo4j.configuration.helpers.SocketAddress socketAddress7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory4.wihadsBackupEnvironmentFactory(
        socketAddress7);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config10 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.config(config10);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory11.isRp(true);
    org.neo4j.configuration.Config config14 = factory11.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory4.config(config14);
    org.neo4j.consistency.checking.full.ConsistencyFlags consistencyFlags16 = null;
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction17 = null;
    org.neo4j.logging.LogProvider logProvider18 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config20 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.config(config20);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory21.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory21.isSicc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern26 = factory21.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory21.isFtfb(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config30 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory31 = factory29.config(config30);
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory31.isRp(true);
    org.neo4j.configuration.Config config34 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = factory33.config(config34);
    org.neo4j.configuration.helpers.SocketAddress socketAddress36 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory33.wihadsBackupEnvironmentFactory(
        socketAddress36);
    org.neo4j.configuration.helpers.SocketAddress socketAddress38 = factory33.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory33.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory40.isIcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment backupEnvironment43 = factory42.bulBackupEnvironment();
    java.nio.file.Path path44 = backupEnvironment43.getPbPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory21.prPath(path44);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory46 = null;
    io.github.onograph.backup.BackupVerificationServiceImpl backupVerificationServiceImpl47 = new io.github.onograph.backup.BackupVerificationServiceImpl(
        config14, consistencyFlags16, fileSystemAbstraction17, logProvider18, path44,
        progressMonitorFactory46);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = factory48.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory48.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory48.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory54.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory54.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment60 = factory54.bulBackupEnvironment();
    boolean boolean61 = backupEnvironment60.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional62 = backupEnvironment60.geicmaOptional();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional63 = backupEnvironment60.geicmaOptional();
    java.nio.file.Path path64 = backupEnvironment60.getRpPath();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern65 = backupEnvironment60.getDatabaseNamePattern();
    boolean boolean66 = backupEnvironment60.getIsRp();
    java.nio.file.Path path67 = backupEnvironment60.getPbPath();
    io.github.onograph.backup.FileMoverService fileMoverService68 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path44, path67);
    java.nio.file.Path path69 = fileMoverService68.filPath();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(config14);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(databaseNamePattern26);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory31);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNull(socketAddress38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(backupEnvironment43);
    org.junit.Assert.assertNotNull(path44);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(backupEnvironment60);
    org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional62);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional63);
    org.junit.Assert.assertNotNull(path64);
    org.junit.Assert.assertNotNull(databaseNamePattern65);
    org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    org.junit.Assert.assertNotNull(path67);
    org.junit.Assert.assertNotNull(fileMoverService68);
    org.junit.Assert.assertNotNull(path69);
  }

  @Test
  public void test1205() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1205");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        (int) (short) 10, "hi!");
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions12 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory6.miAuthMetaOptions(
        authMetaOptions12);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory6.wihadsBackupEnvironmentFactory(
        0, "hi!");
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory16);
  }

  @Test
  public void test1206() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1206");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory7.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory7.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory15 = factory13.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory13.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment19 = factory13.bulBackupEnvironment();
    org.neo4j.memory.MemoryTracker memoryTracker20 = backupEnvironment19.getMemoryTracker();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern21 = backupEnvironment19.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress22 = backupEnvironment19.getSocketAddress();
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory6.wihadsBackupEnvironmentFactory(
        socketAddress22);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory15);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(backupEnvironment19);
    org.junit.Assert.assertNotNull(memoryTracker20);
    org.junit.Assert.assertNotNull(databaseNamePattern21);
    org.junit.Assert.assertNotNull(socketAddress22);
    org.junit.Assert.assertNotNull(factory23);
  }

  @Test
  public void test1207() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1207");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    org.neo4j.configuration.helpers.SocketAddress socketAddress15 = backupEnvironment12.getSocketAddress();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment12.geicmaOptional();
    java.nio.file.Path path17 = backupEnvironment12.getPbPath();
    boolean boolean18 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path17);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(socketAddress15);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
  }

  @Test
  public void test1208() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1208");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern15 = backupEnvironment12.getDatabaseNamePattern();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment12.geicmaOptional();
    org.neo4j.memory.MemoryTracker memoryTracker17 = backupEnvironment12.getMemoryTracker();
    org.neo4j.configuration.helpers.SocketAddress socketAddress18 = backupEnvironment12.getSocketAddress();
    java.nio.file.Path path19 = backupEnvironment12.getPbPath();
    java.nio.file.Path path20 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path19);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(databaseNamePattern15);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(memoryTracker17);
    org.junit.Assert.assertNotNull(socketAddress18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
  }

  @Test
  public void test1209() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1209");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.logging.LogProvider logProvider7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.uLogProvider(
        logProvider7);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.fFileSystemAbstraction(
        fileSystemAbstraction9);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator6.progressMonitorFactory(
        progressMonitorFactory11);
    io.github.onograph.backup.BackupRunner backupRunner13 = generator6.bulBackupRunner();
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(backupRunner13);
  }

  @Test
  public void test1210() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1210");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    java.nio.file.Path path15 = backupEnvironment12.getPbPath();
    java.nio.file.Path path16 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path15);
    java.nio.file.Path path17 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path15);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory20 = factory18.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory22 = factory18.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory24 = factory18.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory26 = factory24.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory24.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment30 = factory24.bulBackupEnvironment();
    boolean boolean31 = backupEnvironment30.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional32 = backupEnvironment30.geicmaOptional();
    java.nio.file.Path path33 = backupEnvironment30.getPbPath();
    java.nio.file.Path path34 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path33);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory35.isGcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config39 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.config(config39);
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory40.isRp(true);
    org.neo4j.configuration.Config config43 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory42.config(config43);
    org.neo4j.configuration.helpers.SocketAddress socketAddress45 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory42.wihadsBackupEnvironmentFactory(
        socketAddress45);
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory47.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory50.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory50.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory50.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = factory56.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory56.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment62 = factory56.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern63 = backupEnvironment62.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress64 = backupEnvironment62.getSocketAddress();
    java.nio.file.Path path65 = backupEnvironment62.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory66 = factory47.pbPath(path65);
    io.github.onograph.backup.BackupEnvironment.Factory factory67 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory69 = factory67.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory72 = factory70.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory74 = factory70.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory76 = factory70.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory78 = factory76.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory81 = factory76.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment82 = factory76.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern83 = backupEnvironment82.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress84 = backupEnvironment82.getSocketAddress();
    java.nio.file.Path path85 = backupEnvironment82.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory86 = factory67.pbPath(path85);
    io.github.onograph.backup.FileMoverService fileMoverService87 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path65, path85);
    io.github.onograph.backup.BackupEnvironment.Factory factory88 = factory42.pbPath(path85);
    boolean boolean89 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path85);
    io.github.onograph.backup.BackupEnvironment.Factory factory90 = factory35.prPath(path85);
    io.github.onograph.backup.FileMoverService fileMoverService91 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path33, path85);
    io.github.onograph.backup.FileMoverService fileMoverService92 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path17, path33);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(path15);
    org.junit.Assert.assertNotNull(path16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory20);
    org.junit.Assert.assertNotNull(factory22);
    org.junit.Assert.assertNotNull(factory24);
    org.junit.Assert.assertNotNull(factory26);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(backupEnvironment30);
    org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional32);
    org.junit.Assert.assertNotNull(path33);
    org.junit.Assert.assertNotNull(path34);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(backupEnvironment62);
    org.junit.Assert.assertNotNull(databaseNamePattern63);
    org.junit.Assert.assertNotNull(socketAddress64);
    org.junit.Assert.assertNotNull(path65);
    org.junit.Assert.assertNotNull(factory66);
    org.junit.Assert.assertNotNull(factory67);
    org.junit.Assert.assertNotNull(factory69);
    org.junit.Assert.assertNotNull(factory70);
    org.junit.Assert.assertNotNull(factory72);
    org.junit.Assert.assertNotNull(factory74);
    org.junit.Assert.assertNotNull(factory76);
    org.junit.Assert.assertNotNull(factory78);
    org.junit.Assert.assertNotNull(factory81);
    org.junit.Assert.assertNotNull(backupEnvironment82);
    org.junit.Assert.assertNotNull(databaseNamePattern83);
    org.junit.Assert.assertNotNull(socketAddress84);
    org.junit.Assert.assertNotNull(path85);
    org.junit.Assert.assertNotNull(factory86);
    org.junit.Assert.assertNotNull(fileMoverService87);
    org.junit.Assert.assertNotNull(factory88);
    org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    org.junit.Assert.assertNotNull(factory90);
    org.junit.Assert.assertNotNull(fileMoverService91);
    org.junit.Assert.assertNotNull(fileMoverService92);
  }

  @Test
  public void test1211() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1211");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config1 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.config(config1);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory2.isSicc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory5 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config6 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory7 = factory5.config(config6);
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory7.isRp(true);
    org.neo4j.configuration.Config config10 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory9.config(config10);
    org.neo4j.configuration.helpers.SocketAddress socketAddress12 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory13 = factory9.wihadsBackupEnvironmentFactory(
        socketAddress12);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory17.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory17.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory23.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment29 = factory23.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern30 = backupEnvironment29.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress31 = backupEnvironment29.getSocketAddress();
    java.nio.file.Path path32 = backupEnvironment29.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory33 = factory14.pbPath(path32);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory36 = factory34.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory37.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory37.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory43.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory43.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment49 = factory43.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern50 = backupEnvironment49.getDatabaseNamePattern();
    org.neo4j.configuration.helpers.SocketAddress socketAddress51 = backupEnvironment49.getSocketAddress();
    java.nio.file.Path path52 = backupEnvironment49.getRpPath();
    io.github.onograph.backup.BackupEnvironment.Factory factory53 = factory34.pbPath(path52);
    io.github.onograph.backup.FileMoverService fileMoverService54 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path32, path52);
    io.github.onograph.backup.BackupEnvironment.Factory factory55 = factory9.pbPath(path52);
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory4.prPath(path52);
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = factory4.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory58.isRp(true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern61 = factory58.gedtenprDatabaseNamePattern();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory5);
    org.junit.Assert.assertNotNull(factory7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(factory13);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(backupEnvironment29);
    org.junit.Assert.assertNotNull(databaseNamePattern30);
    org.junit.Assert.assertNotNull(socketAddress31);
    org.junit.Assert.assertNotNull(path32);
    org.junit.Assert.assertNotNull(factory33);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(factory36);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(backupEnvironment49);
    org.junit.Assert.assertNotNull(databaseNamePattern50);
    org.junit.Assert.assertNotNull(socketAddress51);
    org.junit.Assert.assertNotNull(path52);
    org.junit.Assert.assertNotNull(factory53);
    org.junit.Assert.assertNotNull(fileMoverService54);
    org.junit.Assert.assertNotNull(factory55);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(databaseNamePattern61);
  }

  @Test
  public void test1212() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1212");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup1.isCc(false);
    java.io.OutputStream outputStream6 = null;
    try {
      io.github.onograph.backup.Backup backup7 = backup1.outputStream(outputStream6);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: outputStream");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
  }

  @Test
  public void test1213() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1213");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.progressMonitorFactory(
        progressMonitorFactory7);
    io.github.onograph.backup.BackupRunner backupRunner9 = generator8.bulBackupRunner();
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction10 = null;
    io.github.onograph.backup.BackupRunner.Generator generator11 = generator8.fFileSystemAbstraction(
        fileSystemAbstraction10);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction12 = null;
    io.github.onograph.backup.BackupRunner.Generator generator13 = generator8.fFileSystemAbstraction(
        fileSystemAbstraction12);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(backupRunner9);
    org.junit.Assert.assertNotNull(generator11);
    org.junit.Assert.assertNotNull(generator13);
  }

  @Test
  public void test1214() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1214");
    }
    io.github.onograph.backup.Backup backup1 = io.github.onograph.backup.Backup.froBackup("");
    io.github.onograph.backup.Backup backup3 = backup1.isCc(true);
    io.github.onograph.backup.Backup backup5 = backup3.isCc(true);
    io.github.onograph.backup.Backup backup7 = backup5.isCc(true);
    io.github.onograph.backup.Backup backup9 = backup5.isBftf(true);
    java.io.OutputStream outputStream10 = null;
    try {
      io.github.onograph.backup.Backup backup11 = backup5.outputStream(outputStream10);
      org.junit.Assert.fail(
          "Expected exception of type java.lang.NullPointerException; message: outputStream");
    } catch (java.lang.NullPointerException e) {
    }
    org.junit.Assert.assertNotNull(backup1);
    org.junit.Assert.assertNotNull(backup3);
    org.junit.Assert.assertNotNull(backup5);
    org.junit.Assert.assertNotNull(backup7);
    org.junit.Assert.assertNotNull(backup9);
  }

  @Test
  public void test1215() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1215");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions3 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.miAuthMetaOptions(
        authMetaOptions3);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions7 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.miAuthMetaOptions(
        authMetaOptions7);
    org.neo4j.configuration.Config config9 = factory8.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config11 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.config(config11);
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory12.isRp(true);
    org.neo4j.configuration.Config config15 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.config(config15);
    io.github.onograph.backup.BackupEnvironment.Factory factory18 = factory14.databaseNamePattern(
        "database.id");
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory19.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions22 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory19.miAuthMetaOptions(
        authMetaOptions22);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isGcc(
        (java.lang.Boolean) false);
    io.github.onograph.backup.BackupEnvironment.Factory factory27 = factory25.isIcc(
        (java.lang.Boolean) false);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern28 = factory25.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory29 = factory14.databaseNamePattern(
        databaseNamePattern28);
    io.github.onograph.backup.BackupEnvironment.Factory factory30 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config31 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory32 = factory30.config(config31);
    io.github.onograph.backup.BackupEnvironment.Factory factory34 = factory32.isRp(true);
    org.neo4j.configuration.Config config35 = factory32.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory32.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory38 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory40 = factory38.isCc(false);
    java.nio.file.Path path41 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory42 = factory38.prPath(path41);
    java.nio.file.Path path43 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory44 = factory42.prPath(path43);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory47 = factory45.isCc(false);
    java.nio.file.Path path48 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory49 = factory45.prPath(path48);
    io.github.onograph.backup.BackupEnvironment.Factory factory50 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config51 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory52 = factory50.config(config51);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = factory52.isRp(true);
    org.neo4j.configuration.Config config55 = factory52.gecfConfig();
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory45.config(config55);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = factory44.config(config55);
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = factory37.config(config55);
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory29.config(config55);
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory8.config(config55);
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory8.isGcc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.helpers.SocketAddress socketAddress63 = factory62.getSocketAddress();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(config9);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory18);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory27);
    org.junit.Assert.assertNotNull(databaseNamePattern28);
    org.junit.Assert.assertNotNull(factory29);
    org.junit.Assert.assertNotNull(factory30);
    org.junit.Assert.assertNotNull(factory32);
    org.junit.Assert.assertNotNull(factory34);
    org.junit.Assert.assertNotNull(config35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory38);
    org.junit.Assert.assertNotNull(factory40);
    org.junit.Assert.assertNotNull(factory42);
    org.junit.Assert.assertNotNull(factory44);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory47);
    org.junit.Assert.assertNotNull(factory49);
    org.junit.Assert.assertNotNull(factory50);
    org.junit.Assert.assertNotNull(factory52);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(config55);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNull(socketAddress63);
  }

  @Test
  public void test1216() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1216");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional14 = backupEnvironment12.geicmaOptional();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern15 = backupEnvironment12.getDatabaseNamePattern();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional16 = backupEnvironment12.geicmaOptional();
    org.neo4j.memory.MemoryTracker memoryTracker17 = backupEnvironment12.getMemoryTracker();
    org.neo4j.configuration.helpers.SocketAddress socketAddress18 = backupEnvironment12.getSocketAddress();
    java.nio.file.Path path19 = backupEnvironment12.getRpPath();
    java.nio.file.Path path20 = backupEnvironment12.getRpPath();
    boolean boolean21 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path20);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional14);
    org.junit.Assert.assertNotNull(databaseNamePattern15);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional16);
    org.junit.Assert.assertNotNull(memoryTracker17);
    org.junit.Assert.assertNotNull(socketAddress18);
    org.junit.Assert.assertNotNull(path19);
    org.junit.Assert.assertNotNull(path20);
    org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
  }

  @Test
  public void test1217() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1217");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern13 = backupEnvironment12.getDatabaseNamePattern();
    boolean boolean14 = backupEnvironment12.getIsBftf();
    boolean boolean15 = backupEnvironment12.getIsCc();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern16 = backupEnvironment12.getDatabaseNamePattern();
    java.nio.file.Path path17 = backupEnvironment12.getRpPath();
    org.neo4j.memory.MemoryTracker memoryTracker18 = backupEnvironment12.getMemoryTracker();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional19 = backupEnvironment12.geicmaOptional();
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertNotNull(databaseNamePattern13);
    org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    org.junit.Assert.assertNotNull(databaseNamePattern16);
    org.junit.Assert.assertNotNull(path17);
    org.junit.Assert.assertNotNull(memoryTracker18);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional19);
  }

  @Test
  public void test1218() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1218");
    }
    io.github.onograph.backup.BackupRunner.Generator generator0 = io.github.onograph.backup.BackupRunner.bulrBackupRunnerGenerator();
    org.neo4j.logging.LogProvider logProvider1 = null;
    io.github.onograph.backup.BackupRunner.Generator generator2 = generator0.itraLogProvider(
        logProvider1);
    org.neo4j.time.SystemNanoClock systemNanoClock3 = null;
    io.github.onograph.backup.BackupRunner.Generator generator4 = generator2.systemNanoClock(
        systemNanoClock3);
    org.neo4j.logging.LogProvider logProvider5 = null;
    io.github.onograph.backup.BackupRunner.Generator generator6 = generator2.itraLogProvider(
        logProvider5);
    org.neo4j.logging.LogProvider logProvider7 = null;
    io.github.onograph.backup.BackupRunner.Generator generator8 = generator6.uLogProvider(
        logProvider7);
    org.neo4j.io.fs.FileSystemAbstraction fileSystemAbstraction9 = null;
    io.github.onograph.backup.BackupRunner.Generator generator10 = generator6.fFileSystemAbstraction(
        fileSystemAbstraction9);
    org.neo4j.logging.LogProvider logProvider11 = null;
    io.github.onograph.backup.BackupRunner.Generator generator12 = generator10.itraLogProvider(
        logProvider11);
    org.neo4j.internal.helpers.progress.ProgressMonitorFactory progressMonitorFactory13 = null;
    io.github.onograph.backup.BackupRunner.Generator generator14 = generator12.progressMonitorFactory(
        progressMonitorFactory13);
    org.neo4j.logging.LogProvider logProvider15 = null;
    io.github.onograph.backup.BackupRunner.Generator generator16 = generator12.uLogProvider(
        logProvider15);
    org.junit.Assert.assertNotNull(generator0);
    org.junit.Assert.assertNotNull(generator2);
    org.junit.Assert.assertNotNull(generator4);
    org.junit.Assert.assertNotNull(generator6);
    org.junit.Assert.assertNotNull(generator8);
    org.junit.Assert.assertNotNull(generator10);
    org.junit.Assert.assertNotNull(generator12);
    org.junit.Assert.assertNotNull(generator14);
    org.junit.Assert.assertNotNull(generator16);
  }

  @Test
  public void test1219() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1219");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory0.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory8 = factory6.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory11 = factory6.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment12 = factory6.bulBackupEnvironment();
    boolean boolean13 = backupEnvironment12.getIsBftf();
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern14 = backupEnvironment12.getDatabaseNamePattern();
    java.nio.file.Path path15 = backupEnvironment12.getRpPath();
    java.nio.file.Path path16 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path15);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory17.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory17.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory23.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment29 = factory23.bulBackupEnvironment();
    boolean boolean30 = backupEnvironment29.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional31 = backupEnvironment29.geicmaOptional();
    java.nio.file.Path path32 = backupEnvironment29.getPbPath();
    java.nio.file.Path path33 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path32);
    java.nio.file.Path path34 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path33);
    io.github.onograph.backup.BackupEnvironment.Factory factory35 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = factory35.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory35.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory35.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory41.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory46 = factory41.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment47 = factory41.bulBackupEnvironment();
    boolean boolean48 = backupEnvironment47.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional49 = backupEnvironment47.geicmaOptional();
    java.nio.file.Path path50 = backupEnvironment47.getPbPath();
    java.nio.file.Path path51 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path50);
    io.github.onograph.backup.FileMoverService fileMoverService52 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path33, path51);
    io.github.onograph.backup.FileMoverService fileMoverService53 = io.github.onograph.backup.FileMoverService.movifeseFileMoverService(
        path16, path33);
    io.github.onograph.backup.BackupEnvironment.Factory factory54 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory54.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory58 = factory54.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory60 = factory54.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory62 = factory60.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory65 = factory60.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment66 = factory60.bulBackupEnvironment();
    boolean boolean67 = backupEnvironment66.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional68 = backupEnvironment66.geicmaOptional();
    boolean boolean69 = backupEnvironment66.getIsRp();
    boolean boolean70 = backupEnvironment66.getIsBftf();
    java.nio.file.Path path71 = backupEnvironment66.getPbPath();
    io.github.onograph.backup.FileMoverService fileMoverService72 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path33, path71);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(factory8);
    org.junit.Assert.assertNotNull(factory11);
    org.junit.Assert.assertNotNull(backupEnvironment12);
    org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    org.junit.Assert.assertNotNull(databaseNamePattern14);
    org.junit.Assert.assertNotNull(path15);
    org.junit.Assert.assertNotNull(path16);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(backupEnvironment29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional31);
    org.junit.Assert.assertNotNull(path32);
    org.junit.Assert.assertNotNull(path33);
    org.junit.Assert.assertNotNull(path34);
    org.junit.Assert.assertNotNull(factory35);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory46);
    org.junit.Assert.assertNotNull(backupEnvironment47);
    org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional49);
    org.junit.Assert.assertNotNull(path50);
    org.junit.Assert.assertNotNull(path51);
    org.junit.Assert.assertNotNull(fileMoverService52);
    org.junit.Assert.assertNotNull(fileMoverService53);
    org.junit.Assert.assertNotNull(factory54);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory58);
    org.junit.Assert.assertNotNull(factory60);
    org.junit.Assert.assertNotNull(factory62);
    org.junit.Assert.assertNotNull(factory65);
    org.junit.Assert.assertNotNull(backupEnvironment66);
    org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional68);
    org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    org.junit.Assert.assertNotNull(path71);
    org.junit.Assert.assertNotNull(fileMoverService72);
  }

  @Test
  public void test1220() throws Throwable {
    if (debug) {
      System.out.format("%n%s%n", "ModRegTest2.test1220");
    }
    io.github.onograph.backup.BackupEnvironment.Factory factory0 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory2 = factory0.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory4 = factory0.isRp(false);
    java.nio.file.Path path5 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory6 = factory4.prPath(path5);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern7 = factory6.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory9 = factory6.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory10 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory12 = factory10.isCc(false);
    io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions authMetaOptions13 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory14 = factory10.miAuthMetaOptions(
        authMetaOptions13);
    io.github.onograph.backup.BackupEnvironment.Factory factory16 = factory14.isCc(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory17 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory19 = factory17.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory21 = factory17.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory23 = factory17.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory25 = factory23.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory28 = factory23.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment29 = factory23.bulBackupEnvironment();
    boolean boolean30 = backupEnvironment29.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional31 = backupEnvironment29.geicmaOptional();
    java.nio.file.Path path32 = backupEnvironment29.getPbPath();
    java.nio.file.Path path33 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path32);
    java.nio.file.Path path34 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path33);
    boolean boolean35 = io.github.onograph.backup.BackupMetadataRepository.isMedaflForPa(path34);
    java.nio.file.Path path36 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path34);
    io.github.onograph.backup.BackupEnvironment.Factory factory37 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory39 = factory37.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory41 = factory37.isRp(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory43 = factory37.isIcc(
        (java.lang.Boolean) true);
    io.github.onograph.backup.BackupEnvironment.Factory factory45 = factory43.isCc(false);
    io.github.onograph.backup.BackupEnvironment.Factory factory48 = factory43.wihadsBackupEnvironmentFactory(
        100, "hi!");
    io.github.onograph.backup.BackupEnvironment backupEnvironment49 = factory43.bulBackupEnvironment();
    boolean boolean50 = backupEnvironment49.getIsBftf();
    java.util.Optional<io.github.onograph.cluster.raft.module.cuprot.current.core.AuthMetaOptions> authMetaOptionsOptional51 = backupEnvironment49.geicmaOptional();
    java.nio.file.Path path52 = backupEnvironment49.getPbPath();
    java.nio.file.Path path53 = io.github.onograph.backup.BackupMetadataRepository.gefeptPath(
        path52);
    java.nio.file.Path path54 = io.github.onograph.backup.GdbIdRepo.gedtefpPath(path53);
    io.github.onograph.backup.FileMoverService fileMoverService55 = io.github.onograph.backup.FileMoverService.covifeseFileMoverService(
        path34, path53);
    io.github.onograph.backup.BackupEnvironment.Factory factory56 = factory14.prPath(path53);
    io.github.onograph.backup.BackupEnvironment.Factory factory57 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    io.github.onograph.backup.BackupEnvironment.Factory factory59 = factory57.isCc(false);
    java.nio.file.Path path60 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory61 = factory57.prPath(path60);
    io.github.onograph.backup.BackupEnvironment.Factory factory63 = factory61.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory64 = io.github.onograph.backup.BackupEnvironment.bulrBackupEnvironmentFactory();
    org.neo4j.configuration.Config config65 = null;
    io.github.onograph.backup.BackupEnvironment.Factory factory66 = factory64.config(config65);
    io.github.onograph.backup.BackupEnvironment.Factory factory68 = factory66.isRp(true);
    io.github.onograph.backup.BackupEnvironment.Factory factory70 = factory66.isSicc(
        (java.lang.Boolean) true);
    org.neo4j.configuration.helpers.DatabaseNamePattern databaseNamePattern71 = factory66.gedtenprDatabaseNamePattern();
    io.github.onograph.backup.BackupEnvironment.Factory factory72 = factory63.databaseNamePattern(
        databaseNamePattern71);
    io.github.onograph.backup.BackupEnvironment.Factory factory73 = factory56.databaseNamePattern(
        databaseNamePattern71);
    io.github.onograph.backup.BackupEnvironment.Factory factory74 = factory9.databaseNamePattern(
        databaseNamePattern71);
    org.junit.Assert.assertNotNull(factory0);
    org.junit.Assert.assertNotNull(factory2);
    org.junit.Assert.assertNotNull(factory4);
    org.junit.Assert.assertNotNull(factory6);
    org.junit.Assert.assertNotNull(databaseNamePattern7);
    org.junit.Assert.assertNotNull(factory9);
    org.junit.Assert.assertNotNull(factory10);
    org.junit.Assert.assertNotNull(factory12);
    org.junit.Assert.assertNotNull(factory14);
    org.junit.Assert.assertNotNull(factory16);
    org.junit.Assert.assertNotNull(factory17);
    org.junit.Assert.assertNotNull(factory19);
    org.junit.Assert.assertNotNull(factory21);
    org.junit.Assert.assertNotNull(factory23);
    org.junit.Assert.assertNotNull(factory25);
    org.junit.Assert.assertNotNull(factory28);
    org.junit.Assert.assertNotNull(backupEnvironment29);
    org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional31);
    org.junit.Assert.assertNotNull(path32);
    org.junit.Assert.assertNotNull(path33);
    org.junit.Assert.assertNotNull(path34);
    org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    org.junit.Assert.assertNotNull(path36);
    org.junit.Assert.assertNotNull(factory37);
    org.junit.Assert.assertNotNull(factory39);
    org.junit.Assert.assertNotNull(factory41);
    org.junit.Assert.assertNotNull(factory43);
    org.junit.Assert.assertNotNull(factory45);
    org.junit.Assert.assertNotNull(factory48);
    org.junit.Assert.assertNotNull(backupEnvironment49);
    org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    org.junit.Assert.assertNotNull(authMetaOptionsOptional51);
    org.junit.Assert.assertNotNull(path52);
    org.junit.Assert.assertNotNull(path53);
    org.junit.Assert.assertNotNull(path54);
    org.junit.Assert.assertNotNull(fileMoverService55);
    org.junit.Assert.assertNotNull(factory56);
    org.junit.Assert.assertNotNull(factory57);
    org.junit.Assert.assertNotNull(factory59);
    org.junit.Assert.assertNotNull(factory61);
    org.junit.Assert.assertNotNull(factory63);
    org.junit.Assert.assertNotNull(factory64);
    org.junit.Assert.assertNotNull(factory66);
    org.junit.Assert.assertNotNull(factory68);
    org.junit.Assert.assertNotNull(factory70);
    org.junit.Assert.assertNotNull(databaseNamePattern71);
    org.junit.Assert.assertNotNull(factory72);
    org.junit.Assert.assertNotNull(factory73);
    org.junit.Assert.assertNotNull(factory74);
  }
}

