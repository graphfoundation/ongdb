package io.github.onograph.commandline.admin.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.neo4j.cli.ExecutionContext;
import org.neo4j.configuration.Config;
import org.neo4j.graphdb.config.Setting;
import org.neo4j.io.fs.FileSystemAbstraction;

class SetUpgradeUserPasswordCommandTest {

  @Test
  void testConstructor() {

    new SetUpgradeUserPasswordCommand(
        new ExecutionContext(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testConstructor2() {

    new SetUpgradeUserPasswordCommand(
        new ExecutionContext(Paths.get(System.getProperty("Key"), "More"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  @Test
  void testExecute() throws IOException {
    ExecutionContext executionContext = mock(ExecutionContext.class);
    when(executionContext.fs()).thenThrow(new RuntimeException("An error occurred"));
    when(executionContext.confDir()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(executionContext.homeDir()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    assertThrows(RuntimeException.class,
        () -> (new SetUpgradeUserPasswordCommand(executionContext)).execute());
    verify(executionContext).confDir();
    verify(executionContext).fs();
    verify(executionContext).homeDir();
  }

  @Test
  void testExecute2() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    doNothing().when(fileSystemAbstraction).deleteFile((Path) any());
    when(fileSystemAbstraction.fileExists((Path) any())).thenReturn(true);
    ExecutionContext executionContext = mock(ExecutionContext.class);
    when(executionContext.fs()).thenReturn(fileSystemAbstraction);
    when(executionContext.confDir()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(executionContext.homeDir()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    assertThrows(RuntimeException.class,
        () -> (new SetUpgradeUserPasswordCommand(executionContext)).execute());
    verify(executionContext).confDir();
    verify(executionContext).fs();
    verify(executionContext).homeDir();
    verify(fileSystemAbstraction).deleteFile((Path) any());
    verify(fileSystemAbstraction, atLeast(1)).fileExists((Path) any());
  }

  @Test
  void testExecute3() throws IOException {
    FileSystemAbstraction fileSystemAbstraction = mock(FileSystemAbstraction.class);
    doNothing().when(fileSystemAbstraction).deleteFile((Path) any());
    when(fileSystemAbstraction.fileExists((Path) any())).thenReturn(true);
    ExecutionContext executionContext = mock(ExecutionContext.class);
    when(executionContext.fs()).thenReturn(fileSystemAbstraction);
    when(executionContext.confDir()).thenReturn(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    when(executionContext.homeDir()).thenReturn(
        Paths.get(System.getProperty(Boolean.TRUE.toString()), "test.txt"));
    assertThrows(RuntimeException.class,
        () -> (new SetUpgradeUserPasswordCommand(executionContext)).execute());
    verify(executionContext).confDir();
    verify(executionContext).fs();
    verify(executionContext).homeDir();
    verify(fileSystemAbstraction).deleteFile((Path) any());
    verify(fileSystemAbstraction, atLeast(1)).fileExists((Path) any());
  }

  @Test
  void testLodnocoiConfig() {
    Config actualLodnocoiConfigResult = (new SetUpgradeUserPasswordCommand(
        new ExecutionContext(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")))).lodnocoiConfig();
    Map<String, Setting<Object>> declaredSettings = actualLodnocoiConfigResult.getDeclaredSettings();
    assertEquals(529, declaredSettings.size());
    String toStringResult = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "logs",
            "raft-messages.log")
        .toString();
    String property = System.getProperty("sun.os.patch.level");
    String toStringResult1 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "data",
            "cluster-state")
        .toString();
    String toStringResult2 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "data")
        .toString();
    String toStringResult3 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "data",
        "dumps").toString();
    String toStringResult4 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString();
    String toStringResult5 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "lib")
        .toString();
    String toStringResult6 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "licenses")
        .toString();
    String toStringResult7 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "logs")
        .toString();
    String toStringResult8 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "metrics")
        .toString();
    String toStringResult9 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString();
    String toStringResult10 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "plugins")
        .toString();
    String toStringResult11 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "run")
        .toString();
    String toStringResult12 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "data",
        "scripts").toString();
    String toStringResult13 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "data",
            "transactions")
        .toString();
    String toStringResult14 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "data",
            "databases", "neo4j")
        .toString();
    String toStringResult15 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "scripts")
        .toString();
    String toStringResult16 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "logs",
            "debug.log")
        .toString();
    String toStringResult17 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "logs",
            "http.log")
        .toString();
    String toStringResult18 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "logs",
            "query.log")
        .toString();
    String toStringResult19 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "logs",
            "security.log")
        .toString();
    String toStringResult20 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "logs",
            "neo4j.log")
        .toString();
    String toStringResult21 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "stdOut")
        .toString();
    String toStringResult22 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "data",
        "dbms").toString();
    String toStringResult23 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "data",
            "databases")
        .toString();
    String toStringResult24 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "run",
            "neo4j.pid")
        .toString();
    String toStringResult25 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "scripts")
        .toString();
    String toStringResult26 = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt", "bin",
        "tools").toString();
    String expectedToStringResult = String.join("", "browser.post_connect_cmd=\n"
            + "browser.remote_content_hostname_whitelist=guides.neo4j.com,localhost\n"
            + "causal_clustering.akka_actor_system_restarter.initial_delay=1s\n"
            + "causal_clustering.akka_actor_system_restarter.max_acceptable_failures=8\n"
            + "causal_clustering.akka_actor_system_restarter.max_delay=1m\n"
            + "causal_clustering.catch_up_client_inactivity_timeout=10m\n" +
            "causal_clustering.catchup_batch_size=64\n"
            + "causal_clustering.cluster_allow_reads_on_followers=true\n"
            + "causal_clustering.cluster_allow_reads_on_leader=false\n"
            + "causal_clustering.cluster_binding_retry_timeout=1m\n" +
            "causal_clustering.cluster_binding_timeout=5m\n"
            + "causal_clustering.cluster_id_publish_timeout=15s\n" +
            "causal_clustering.cluster_topology_refresh=5s\n"
            + "causal_clustering.command_applier_parallelism=8\n" +
            "causal_clustering.connect_randomly_to_server_group=\n"
            + "causal_clustering.discovery_advertised_address=localhost:5000\n"
            + "causal_clustering.discovery_listen_address=localhost:5000\n"
            + "causal_clustering.discovery_resolution_retry_interval=5s\n"
            + "causal_clustering.discovery_resolution_timeout=5m\n"
            + "causal_clustering.discovery_type=LIST\n"
            + "causal_clustering.election_failure_detection_window=3s-6s\n" +
            "causal_clustering.enable_pre_voting=true\n"
            + "causal_clustering.global_session_tracker_state_size=1000\n" +
            "causal_clustering.handshake_timeout=20s\n"
            + "causal_clustering.in_flight_cache.max_bytes=2.00GiB\n"
            + "causal_clustering.in_flight_cache.max_entries=1024\n"
            + "causal_clustering.in_flight_cache.type=ST_FOLLOWING_CT\n"
            + "causal_clustering.initial_discovery_members=No Value\n" +
            "causal_clustering.join_catch_up_max_lag=10s\n"
            + "causal_clustering.join_catch_up_timeout=10m\n"
            + "causal_clustering.kubernetes.address=kubernetes.default.svc:443\n"
            + "causal_clustering.kubernetes.ca_crt=/var/run/secrets/kubernetes.io/serviceaccount/ca.crt\n"
            + "causal_clustering.kubernetes.cluster_domain=cluster.local\n"
            + "causal_clustering.kubernetes.label_selector=No Value\n"
            + "causal_clustering.kubernetes.namespace=/var/run/secrets/kubernetes.io/serviceaccount/namespace\n"
            + "causal_clustering.kubernetes.service_port_name=No Value\n"
            + "causal_clustering.kubernetes.token=/var/run/secrets/kubernetes.io/serviceaccount/token\n"
            + "causal_clustering.last_applied_state_size=1000\n"
            + "causal_clustering.leader_election_timeout=7s\n"
            + "causal_clustering.leader_failure_detection_window=20s-23s\n"
            + "causal_clustering.leader_transfer_interval=15s\n" +
            "causal_clustering.leader_transfer_member_backoff=30s\n"
            + "causal_clustering.leader_transfer_timeout=3s\n" +
            "causal_clustering.leadership_balancing=LBAT_SPLIT\n"
            + "causal_clustering.leadership_priority_group=\n" +
            "causal_clustering.load_balancing.plugin=server_policies\n"
            + "causal_clustering.load_balancing.shuffle=true\n"
            + "causal_clustering.log_shipping_max_lag=256\n"
            + "causal_clustering.log_shipping_retry_timeout=5s\n"
            + "causal_clustering.max_raft_channels=8\n"
            + "causal_clustering.middleware.akka.allow_any_core_to_bootstrap=false\n"
            + "causal_clustering.middleware.akka.bind_timeout=10s\n"
            + "causal_clustering.middleware.akka.cluster.min_nr_of_members=2\n"
            + "causal_clustering.middleware.akka.cluster.seed_node_timeout=30s\n"
            + "causal_clustering.middleware.akka.cluster.seed_node_timeout_on_first_start=3s\n"
            + "causal_clustering.middleware.akka.connection_timeout=10s\n"
            + "causal_clustering.middleware.akka.default_parallelism=4\n"
            + "causal_clustering.middleware.akka.down_unreachable_on_new_joiner=true\n"
            + "causal_clustering.middleware.akka.external_config=No Value\n"
            + "causal_clustering.middleware.akka.failure_detector.acceptable_heartbeat_pause=30s\n"
            + "causal_clustering.middleware.akka.failure_detector.expected_response_after=10s\n"
            + "causal_clustering.middleware.akka.failure_detector.heartbeat_interval=1s\n"
            + "causal_clustering.middleware.akka.failure_detector.max_sample_size=1000\n"
            + "causal_clustering.middleware.akka.failure_detector.min_std_deviation=100ms\n"
            + "causal_clustering.middleware.akka.failure_detector.monitored_by_nr_of_members=5\n"
            + "causal_clustering.middleware.akka.failure_detector.threshold=12.0\n"
            + "causal_clustering.middleware.akka.handshake_timeout=30s\n"
            + "causal_clustering.middleware.akka.shutdown_timeout=2m\n"
            + "causal_clustering.middleware.akka.sink_parallelism=2\n" +
            "causal_clustering.middleware.logging.level=WARN\n"
            + "causal_clustering.minimum_core_cluster_size_at_formation=3\n"
            + "causal_clustering.minimum_core_cluster_size_at_runtime=3\n" +
            "causal_clustering.multi_dc_license=false\n"
            + "causal_clustering.protocol_implementations.catchup=\n"
            + "causal_clustering.protocol_implementations.compression=\n"
            + "causal_clustering.protocol_implementations.raft=\n"
            + "causal_clustering.pull_interval=1s\n"
            + "causal_clustering.raft_advertised_address=localhost:7000\n"
            + "causal_clustering.raft_handler_parallelism=8\n"
            + "causal_clustering.raft_in_queue_max_batch=128\n"
            + "causal_clustering.raft_in_queue_max_batch_bytes=8.00MiB\n"
            + "causal_clustering.raft_in_queue_max_bytes=2.00GiB\n"
            + "causal_clustering.raft_in_queue_size=1024\n"
            + "causal_clustering.raft_listen_address=localhost:7000\n"
            + "causal_clustering.raft_log_implementation=SEGMENTED\n"
            + "causal_clustering.raft_log_prune_strategy=1g size\n" +
            "causal_clustering.raft_log_pruning_frequency=10m\n"
            + "causal_clustering.raft_log_reader_pool_size=8\n" +
            "causal_clustering.raft_log_rotation_size=250.00MiB\n"
            + "causal_clustering.raft_membership_state_size=1000\n" +
            "causal_clustering.raft_messages_log_enable=false\n"
            + "causal_clustering.raft_messages_log_path=", toStringResult,
        "\n" + "causal_clustering.raft_term_state_size=1000\n"
            + "causal_clustering.raft_vote_state_size=1000\n"
            + "causal_clustering.read_replica_transaction_applier_batch_size=1\n"
            + "causal_clustering.read_replica_transaction_applier_max_queue_size=10\n"
            + "causal_clustering.refuse_to_be_leader=false\n"
            + "causal_clustering.replicated_lease_state_size=1000\n"
            + "causal_clustering.replication_leader_await_timeout=10s\n"
            + "causal_clustering.replication_retry_timeout_base=10s\n"
            + "causal_clustering.replication_retry_timeout_limit=1m\n"
            + "causal_clustering.server_groups=\n"
            + "causal_clustering.state_machine_apply_max_batch_size=16\n"
            + "causal_clustering.state_machine_flush_window_size=4096\n"
            + "causal_clustering.status_throughput_window=5s\n"
            + "causal_clustering.store_copy_backoff_max_wait=5s\n"
            + "causal_clustering.store_copy_chunk_size=32768\n"
            + "causal_clustering.store_copy_max_retry_time_per_request=20m\n"
            + "causal_clustering.store_copy_parallelism=8\n"
            + "causal_clustering.transaction_advertised_address=localhost:6000\n"
            + "causal_clustering.transaction_listen_address=localhost:6000\n"
            + "causal_clustering.",
        property,
        "_address_logging_throttle=10s\n"
            + "causal_clustering.upstream_selection_strategy=default\n"
            + "causal_clustering.use_native_transport=true\n"
            + "causal_clustering.user_defined_upstream_strategy=\n"
            + "cypher.default_language_version=default\n"
            + "cypher.forbid_exhaustive_shortestpath=false\n"
            + "cypher.forbid_shortestpath_common_nodes=true\n" + "cypher.hints_error=false\n"
            + "cypher.lenient_create_relationship=false\n" + "cypher.min_replan_interval=10s\n"
            + "cypher.planner=DEFAULT\n" + "cypher.statistics_divergence_threshold=0.75\n"
            + "db.temporal.timezone=Z\n"
            + "dbms.allow_single_automatic_upgrade=true\n" + "dbms.allow_upgrade=false\n" +
            "dbms.backup.enabled=true\n"
            + "dbms.backup.incremental.strategy=TFT_UNLMT\n"
            + "dbms.backup.listen_address=127.0.0.1:6362\n"
            + "dbms.capabilities.blocked=\n" + "dbms.checkpoint=PERIODIC\n"
            + "dbms.checkpoint.interval.time=15m\n"
            + "dbms.checkpoint.interval.tx=100000\n" + "dbms.checkpoint.iops.limit=600\n"
            + "dbms.clustering.enable=false\n" + "dbms.config.strict_validation=false\n"
            + "dbms.connector.bolt.advertised_address=localhost:7687\n"
            + "dbms.connector.bolt.connection_keep_alive=1m\n"
            + "dbms.connector.bolt.connection_keep_alive_for_requests=STREAMING\n"
            + "dbms.connector.bolt.connection_keep_alive_probes=2\n"
            + "dbms.connector.bolt.connection_keep_alive_streaming_scheduling_interval=1m\n"
            + "dbms.connector.bolt.enabled=false\n"
            + "dbms.connector.bolt.listen_address=localhost:7687\n"
            + "dbms.connector.bolt.ocsp_stapling_enabled=false\n"
            + "dbms.connector.bolt.tcp_keep_alive=true\n"
            + "dbms.connector.bolt.thread_pool_keep_alive=5m\n"
            + "dbms.connector.bolt.thread_pool_max_size=400\n"
            + "dbms.connector.bolt.thread_pool_min_size=5\n"
            + "dbms.connector.bolt.tls_level=DISABLED\n"
            + "dbms.connector.bolt.unsupported_thread_pool_queue_size=0\n"
            + "dbms.connector.bolt.unsupported_thread_pool_shutdown_wait_time=5s\n"
            + "dbms.connector.bolt.unsupported_unauth_connection_timeout=30s\n"
            + "dbms.connector.bolt.unsupported_unauth_max_inbound_bytes=8.00KiB\n"
            + "dbms.connector.http.advertised_address=localhost:7474\n"
            + "dbms.connector.http.enabled=false\n"
            + "dbms.connector.http.listen_address=localhost:7474\n"
            + "dbms.connector.https.advertised_address=localhost:7473\n"
            + "dbms.connector.https.enabled=false\n"
            + "dbms.connector.https.listen_address=localhost:7473\n"
            + "dbms.databases.default_to_read_only=false\n"
            + "dbms.databases.read_only=\n" + "dbms.databases.writable=\n"
            + "dbms.db.timezone=UTC\n"
            + "dbms.default_advertised_address=localhost\n" + "dbms.default_database=neo4j\n"
            + "dbms.default_listen_address=localhost\n" + "dbms.directories.cluster_state=",
        toStringResult1, "\ndbms.directories.data=", toStringResult2,
        "\ndbms.directories.dumps.root=",
        toStringResult3,
        "\ndbms.directories.import=", toStringResult4, "\ndbms.directories.lib=", toStringResult5,
        "\ndbms.directories.licenses=", toStringResult6, "\ndbms.directories.logs=",
        toStringResult7,
        "\ndbms.directories.metrics=", toStringResult8, "\ndbms.directories.neo4j_home=",
        toStringResult9,
        "\ndbms.directories.plugins=", toStringResult10, "\ndbms.directories.run=",
        toStringResult11,
        "\ndbms.directories.script.root=", toStringResult12,
        "\ndbms.directories.transaction.logs.root=",
        toStringResult13, "\ndbms.directories.tx_log=", toStringResult14,
        "\n" + "dbms.dynamic.setting.allowlist=*\n" + "dbms.dynamic.setting.whitelist=*\n"
            + "dbms.filewatcher.enabled=true\n"
            + "dbms.http_enabled_modules=TRANSACTIONAL_ENDPOINTS,UNMANAGED_EXTENSIONS,BROWSER,ENTERPRISE_MANAGEMENT"
            + "_ENDPOINTS\n" + "dbms.import.csv.buffer_size=2097152\n"
            + "dbms.import.csv.legacy_quote_escaping=true\n"
            + "dbms.index.default_schema_provider=native-btree-1.0\n"
            + "dbms.index.fulltext.default_analyzer=standard-no-stop-words\n"
            + "dbms.index.fulltext.eventually_consistent=false\n"
            + "dbms.index.fulltext.eventually_consistent_index_update_queue_max_length=10000\n"
            + "dbms.index_sampling.background_enabled=true\n"
            + "dbms.index_sampling.sample_size_limit=8388608\n"
            + "dbms.index_sampling.update_percentage=5\n"
            + "dbms.index_searcher_cache_size=2147483647\n"
            + "dbms.init_file=",
        toStringResult15,
        "\n" + "dbms.jvm.additional=No Value\n" + "dbms.lock.acquisition.timeout=0s\n"
            + "dbms.log_inconsistent_data_deletion=false\n" + "dbms.logs.debug.format=PLAIN\n"
            + "dbms.logs.debug.level=INFO\n" + "dbms.logs.debug.path=",
        toStringResult16,
        "\n" + "dbms.logs.debug.rotation.delay=5m\n" + "dbms.logs.debug.rotation.keep_number=7\n"
            + "dbms.logs.debug.rotation.size=20.00MiB\n" + "dbms.logs.default_format=PLAIN\n"
            + "dbms.logs.gc.enabled=false\n"
            + "dbms.logs.gc.options=-Xlog:gc*,safepoint,age*=trace\n"
            + "dbms.logs.gc.rotation.keep_number=5\n" + "dbms.logs.gc.rotation.size=20.00MiB\n"
            + "dbms.logs.http.enabled=false\n" + "dbms.logs.http.path=",
        toStringResult17,
        "\n" + "dbms.logs.http.rotation.keep_number=5\n" + "dbms.logs.http.rotation.size=20.00MiB\n"
            + "dbms.logs.query.allocation_logging_enabled=true\n"
            + "dbms.logs.query.early_raw_logging_enabled=false\n"
            + "dbms.logs.query.enabled=VERBOSE\n" + "dbms.logs.query.format=PLAIN\n"
            + "dbms.logs.query.max_parameter_length=2147483647\n"
            + "dbms.logs.query.obfuscate_literals=false\n"
            + "dbms.logs.query.page_logging_enabled=false\n"
            + "dbms.logs.query.parameter_full_entities=false\n"
            + "dbms.logs.query.parameter_logging_enabled=true\n" + "dbms.logs.query.path=",
        toStringResult18, "\n" + "dbms.logs.query.plan_description_enabled=false\n"
            + "dbms.logs.query.rotation.keep_number=7\n"
            + "dbms.logs.query.rotation.size=20.00MiB\n"
            + "dbms.logs.query.runtime_logging_enabled=true\n" + "dbms.logs.query.threshold=0s\n"
            + "dbms.logs.query.time_logging_enabled=false\n" +
            "dbms.logs.query.transaction.enabled=OFF\n"
            + "dbms.logs.query.transaction.threshold=0s\n" +
            "dbms.logs.query.transaction_id.enabled=false\n"
            + "dbms.logs.security.format=PLAIN\n" + "dbms.logs.security.level=INFO\n" +
            "dbms.logs.security.path=",
        toStringResult19,
        "\n" + "dbms.logs.security.rotation.delay=5m\n"
            + "dbms.logs.security.rotation.keep_number=7\n"
            + "dbms.logs.security.rotation.size=20.00MiB\n" + "dbms.logs.user.format=PLAIN\n"
            + "dbms.logs.user.path=",
        toStringResult20,
        "\n" + "dbms.logs.user.rotation.delay=5m\n" + "dbms.logs.user.rotation.keep_number=7\n"
            + "dbms.logs.user.rotation.size=0B\n" + "dbms.logs.user.stdout_enabled=true\n"
            + "dbms.max_databases=100\n"
            + "dbms.memory.heap.initial_size=No Value\n" + "dbms.memory.heap.max_size=No Value\n"
            + "dbms.memory.off_heap.block_cache_size=128\n"
            + "dbms.memory.off_heap.max_cacheable_block_size=512.00KiB\n"
            + "dbms.memory.off_heap.max_size=2.00GiB\n"
            + "dbms.memory.pagecache.directio=false\n"
            + "dbms.memory.pagecache.flush.buffer.enabled=false\n"
            + "dbms.memory.pagecache.flush.buffer.size_in_pages=128\n"
            + "dbms.memory.pagecache.scan.prefetchers=4\n"
            + "dbms.memory.pagecache.size=No Value\n" + "dbms.memory.pagecache.swapper=No Value\n"
            + "dbms.memory.pagecache.warmup.enable=true\n"
            + "dbms.memory.pagecache.warmup.preload=false\n"
            + "dbms.memory.pagecache.warmup.preload.allowlist=.*\n"
            + "dbms.memory.pagecache.warmup.preload.whitelist=.*\n"
            + "dbms.memory.pagecache.warmup.profile.interval=1m\n"
            + "dbms.memory.tracking.enable=true\n"
            + "dbms.memory.transaction.database_max_size=0B\n"
            + "dbms.memory.transaction.global_max_size=0B\n"
            + "dbms.memory.transaction.max_size=0B\n" + "dbms.mode=SINGLE\n"
            + "dbms.netty.ssl.provider=JDK\n"
            + "dbms.panic.shutdown_on_panic=false\n" + "dbms.query_cache_size=1000\n"
            + "dbms.read_only=false\n"
            + "dbms.reconciler.max_backoff=1h\n" + "dbms.reconciler.max_parallelism=8\n"
            + "dbms.reconciler.may_retry=false\n" + "dbms.reconciler.min_backoff=2s\n"
            + "dbms.record_format=\n"
            + "dbms.recovery.fail_on_missing_files=true\n"
            + "dbms.relationship_grouping_threshold=50\n"
            + "dbms.rest.transaction.idle_timeout=1m\n"
            + "dbms.routing.advertised_address=localhost:7688\n"
            + "dbms.routing.client_side.enforce_for_domains=\n"
            + "dbms.routing.default_router=CLIENT\n"
            + "dbms.routing.driver.api=RX\n" + "dbms.routing.driver.connection.connect_timeout=5s\n"
            + "dbms.routing.driver.connection.max_lifetime=1h\n"
            + "dbms.routing.driver.connection.pool.acquisition_timeout=1m\n"
            + "dbms.routing.driver.connection.pool.idle_test=No Value\n"
            + "dbms.routing.driver.connection.pool.max_size=-1\n"
            + "dbms.routing.driver.event_loop_count=12\n"
            + "dbms.routing.driver.idle_check_interval=1m\n"
            + "dbms.routing.driver.logging.leaked_sessions=false\n"
            + "dbms.routing.driver.logging.level=No Value\n" + "dbms.routing.driver.timeout=1m\n"
            + "dbms.routing.enabled=false\n" + "dbms.routing.listen_address=localhost:7688\n"
            + "dbms.routing_ttl=5m\n"
            + "dbms.security.allow_csv_import_from_file_urls=true\n"
            + "dbms.security.auth_cache_max_capacity=10000\n"
            + "dbms.security.auth_cache_ttl=10m\n" + "dbms.security.auth_cache_use_ttl=true\n"
            + "dbms.security.auth_enabled=false\n" + "dbms.security.auth_lock_time=5s\n"
            + "dbms.security.auth_max_failed_attempts=3\n"
            + "dbms.security.authentication_providers=native\n"
            + "dbms.security.authorization_providers=native\n"
            + "dbms.security.causal_clustering_status_auth_enabled=true\n"
            + "dbms.security.http_access_control_allow_origin=*\n"
            + "dbms.security.http_auth_allowlist=/,/browser.*\n"
            + "dbms.security.http_auth_whitelist=/,/browser.*\n"
            + "dbms.security.http_strict_transport_security=No Value\n"
            + "dbms.security.ldap.authentication.attribute=samaccountname\n"
            + "dbms.security.ldap.authentication.cache_enabled=true\n"
            + "dbms.security.ldap.authentication.mechanism=simple\n"
            + "dbms.security.ldap.authentication.search_for_attribute=false\n"
            + "dbms.security.ldap.authentication.use_samaccountname=false\n"
            + "dbms.security.ldap.authentication.user_dn_template=uid={0},ou=users,dc=example,dc=com\n"
            + "dbms.security.ldap.authorization.access_permitted_group=\n"
            + "dbms.security.ldap.authorization.group_membership_attributes=memberOf\n"
            + "dbms.security.ldap.authorization.group_to_role_mapping=\n"
            + "dbms.security.ldap.authorization.system_password=No Value\n"
            + "dbms.security.ldap.authorization.system_username=No Value\n"
            + "dbms.security.ldap.authorization.use_system_account=false\n"
            + "dbms.security.ldap.authorization.user_search_base=ou=users,dc=example,dc=com\n"
            + "dbms.security.ldap.authorization.user_search_filter=(&(objectClass=*)(uid={0}))\n"
            + "dbms.security.ldap.connection_timeout=30s\n" + "dbms.security.ldap.host=localhost\n"
            + "dbms.security.ldap.read_timeout=30s\n" + "dbms.security.ldap.referral=follow\n"
            + "dbms.security.ldap.use_starttls=false\n"
            + "dbms.security.log_successful_authentication=true\n"
            + "dbms.security.procedures.allowlist=*\n"
            + "dbms.security.procedures.default_allowed=\n"
            + "dbms.security.procedures.roles=\n" + "dbms.security.procedures.unrestricted=\n"
            + "dbms.security.procedures.whitelist=*\n"
            + "dbms.security.property_level.blacklist=No Value\n"
            + "dbms.security.property_level.enabled=false\n"
            + "dbms.shutdown_transaction_end_timeout=10s\n"
            + "dbms.store.files.preallocate=true\n" + "dbms.threads.worker_count=12\n"
            + "dbms.track_query_allocation=true\n" + "dbms.track_query_cpu_time=false\n"
            + "dbms.transaction.bookmark_ready_timeout=30s\n"
            + "dbms.transaction.concurrent.maximum=1000\n"
            + "dbms.transaction.monitor.check.interval=2s\n"
            + "dbms.transaction.sampling.percentage=5\n"
            + "dbms.transaction.timeout=0s\n" + "dbms.transaction.tracing.level=DISABLED\n"
            + "dbms.tx_log.preallocate=true\n" + "dbms.tx_log.rotation.retention_policy=7 days\n"
            + "dbms.tx_log.rotation.size=250.00MiB\n" + "dbms.tx_state.memory_allocation=OFF_HEAP\n"
            + "dbms.unmanaged_extension_classes=\n" + "dbms.upgrade_max_processors=0\n"
            + "dbms.windows_service_name=neo4j\n" + "fabric.enabled_by_default=true\n" +
            "fabric.stream.batch_size=50\n"
            + "metrics.bolt.messages.enabled=false\n" + "metrics.csv.enabled=true\n"
            + "metrics.csv.interval=30s\n"
            + "metrics.csv.rotation.compression=NONE\n" + "metrics.csv.rotation.keep_number=7\n"
            + "metrics.csv.rotation.size=10.00MiB\n" + "metrics.cypher.replanning.enabled=false\n"
            + "metrics.enabled=true\n"
            + "metrics.filter=*bolt.connections*,*bolt.messages_received*,*bolt.messages_started*,*dbms.pool.bolt"
            +
            ".free,*dbms.pool.bolt.total_size,*dbms.pool.bolt.total_used,*dbms.pool.bolt.used_heap,*causal_clustering"
            + ".core.is_leader,*causal_clustering.core.last_leader_message,*causal_clustering.core.replication_attempt"
            + ",*causal_clustering.core.replication_fail,*check_point.duration,*check_point.total_time,*cypher.replan"
            + "_events,*ids_in_use.node,*ids_in_use.property,*ids_in_use.relationship,*pool.transaction.*.total_used"
            + ",*pool.transaction.*.used_heap,*pool.transaction.*.used_native,*store.size*,*transaction.active_read"
            + ",*transaction.active_write,*transaction.committed*,*transaction.last_committed_tx_id,*transaction"
            + ".peak_concurrent,*transaction.rollbacks*,*page_cache.hit*,*page_cache.page_faults,*page_cache.usage"
            + "_ratio,*vm.file.descriptors.count,*vm.gc.time.*,*vm.heap.used,*vm.memory.buffer.direct.used,*vm.memory"
            + ".pool.g1_eden_space,*vm.memory.pool.g1_old_gen,*vm.pause_time,*vm.thread*,*db.query.execution*\n"
            + "metrics.graphite.enabled=false\n" + "metrics.graphite.interval=30s\n"
            + "metrics.graphite.server=localhost:2003\n" + "metrics.jmx.enabled=true\n"
            + "metrics.jvm.buffers.enabled=false\n" + "metrics.jvm.file.descriptors.enabled=false\n"
            + "metrics.jvm.gc.enabled=false\n" + "metrics.jvm.heap.enabled=false\n"
            + "metrics.jvm.memory.enabled=false\n" + "metrics.jvm.pause_time.enabled=false\n"
            + "metrics.jvm.threads.enabled=false\n" + "metrics.namespaces.enabled=false\n"
            + "metrics.neo4j.causal_clustering.enabled=false\n"
            + "metrics.neo4j.checkpointing.enabled=false\n"
            + "metrics.neo4j.counts.enabled=false\n" + "metrics.neo4j.data.counts.enabled=false\n"
            + "metrics.neo4j.database_operation_count.enabled=false\n"
            + "metrics.neo4j.logs.enabled=false\n"
            + "metrics.neo4j.pagecache.enabled=false\n" + "metrics.neo4j.pools.enabled=false\n"
            + "metrics.neo4j.server.enabled=false\n" + "metrics.neo4j.size.enabled=false\n"
            + "metrics.neo4j.tx.enabled=false\n" + "metrics.prefix=neo4j\n"
            + "metrics.prometheus.enabled=false\n"
            + "metrics.prometheus.endpoint=localhost:2004\n"
            + "unsupported.causal_clustering.cluster_status_request_maximum_wait=5s\n"
            + "unsupported.causal_clustering.experimental_catchup_protocol_enabled=false\n"
            + "unsupported.causal_clustering.experimental_raft_protocol_enabled=false\n"
            + "unsupported.causal_clustering.inbound_connection_initialization_logging_enabled=true\n"
            + "unsupported.consistency_checker.fail_fast_threshold=0\n"
            + "unsupported.cypher.compiler_tracing=false\n"
            + "unsupported.cypher.enable_planning_relationship_indexes=true\n"
            + "unsupported.cypher.enable_runtime_monitors=false\n"
            + "unsupported.cypher.expression_engine=DEFAULT\n"
            + "unsupported.cypher.expression_recompilation_limit=10\n"
            + "unsupported.cypher.idp_solver_duration_threshold=1000\n"
            + "unsupported.cypher.idp_solver_table_threshold=128\n"
            + "unsupported.cypher.non_indexed_label_warning_threshold=10000\n"
            + "unsupported.cypher.number_of_workers=0\n" + "unsupported.cypher.parser=DEFAULT\n"
            + "unsupported.cypher.pipelined.batch_size_big=1024\n"
            + "unsupported.cypher.pipelined.batch_size_small=128\n"
            + "unsupported.cypher.pipelined.enable_runtime_trace=false\n"
            + "unsupported.cypher.pipelined.operator_engine=DEFAULT\n"
            + "unsupported.cypher.pipelined.operator_fusion_over_pipeline_limit=8\n"
            + "unsupported.cypher.pipelined.runtime_trace_path=",
        toStringResult21,
        "\n" + "unsupported.cypher.pipelined_interpreted_pipes_fallback=DEFAULT\n"
            + "unsupported.cypher.replan_algorithm=DEFAULT\n"
            + "unsupported.cypher.runtime=DEFAULT\n"
            + "unsupported.cypher.splitting_top_behavior=DEFAULT\n"
            + "unsupported.cypher.statistics_divergence_target=0.1\n" +
            "unsupported.cypher.target_replan_interval=7h\n"
            + "unsupported.datacollector.max_query_text_size=10000\n"
            + "unsupported.datacollector.max_recent_query_count=8192\n"
            + "unsupported.dbms.block_create_drop_database=false\n" +
            "unsupported.dbms.block_size.array_properties=0\n"
            + "unsupported.dbms.block_size.labels=0\n" + "unsupported.dbms.block_size.strings=0\n"
            + "unsupported.dbms.block_start_stop_database=false\n"
            + "unsupported.dbms.bolt.inbound_message_throttle.high_watermark=300\n"
            + "unsupported.dbms.bolt.inbound_message_throttle.low_watermark=100\n"
            + "unsupported.dbms.bolt.netty_message_merge_cumulator=false\n"
            + "unsupported.dbms.bolt.netty_server_shutdown_quiet_period=5\n"
            + "unsupported.dbms.bolt.netty_server_shutdown_timeout=15s\n"
            + "unsupported.dbms.bolt.netty_server_use_epoll=true\n"
            + "unsupported.dbms.bolt.outbound_buffer_throttle=true\n"
            + "unsupported.dbms.bolt.outbound_buffer_throttle.high_watermark=524288\n"
            + "unsupported.dbms.bolt.outbound_buffer_throttle.low_watermark=131072\n"
            + "unsupported.dbms.bolt.outbound_buffer_throttle.max_duration=15m\n"
            + "unsupported.dbms.checkpoint_log.rotation.keep.files=3\n"
            + "unsupported.dbms.checkpoint_log.rotation.size=1.00MiB\n"
            + "unsupported.dbms.config.command_evaluation_timeout=30s\n"
            + "unsupported.dbms.counts_store_rotation_timeout=10m\n"
            + "unsupported.dbms.debug.page_cache_tracer_speed_reporting_threshold=10s\n"
            + "unsupported.dbms.debug.print_page_buffer_allocation_trace=false\n"
            + "unsupported.dbms.debug.trace_cursors=false\n"
            + "unsupported.dbms.debug.trace_tx_statement=false\n"
            + "unsupported.dbms.debug.track_cursor_close=false\n"
            + "unsupported.dbms.debug.track_tx_statement_close=false\n"
            + "unsupported.dbms.directories.auth=",
        toStringResult22, "\nunsupported.dbms.directories.databases.root=", toStringResult23,
        "\nunsupported.dbms.directories.pid_file=", toStringResult24,
        "\nunsupported.dbms.directories.scripts=",
        toStringResult25, "\nunsupported.dbms.directories.windows_tools=", toStringResult26,
        "\n" + "unsupported.dbms.discoverable_bolt_address=\n" +
            "unsupported.dbms.discoverable_bolt_routing_address=\n"
            + "unsupported.dbms.dump_diagnostics=true\n"
            + "unsupported.dbms.enable_transaction_heap_allocation_tracking=false\n"
            + "unsupported.dbms.executiontime_limit.time=No Value\n"
            + "unsupported.dbms.extra_lock_verification=false\n"
            + "unsupported.dbms.force_small_id_cache=false\n"
            + "unsupported.dbms.http_paths_blacklist=\n"
            + "unsupported.dbms.idgenerator.log.enabled=false\n"
            + "unsupported.dbms.idgenerator.log.prune_threshold=2d\n"
            + "unsupported.dbms.idgenerator.log.rotation_threshold=200.00MiB\n"
            + "unsupported.dbms.index.archive_failed=false\n"
            + "unsupported.dbms.index.default_fulltext_provider=fulltext-1.0\n"
            + "unsupported.dbms.index.lucene.merge_factor=2\n"
            + "unsupported.dbms.index.lucene.min_merge=0.1\n"
            + "unsupported.dbms.index.lucene.nocfs.ratio=1.0\n"
            + "unsupported.dbms.index.lucene.population_max_buffered_docs=-1\n"
            + "unsupported.dbms.index.lucene.population_ram_buffer_size=50.0\n"
            + "unsupported.dbms.index.lucene.standard_ram_buffer_size=16.0\n"
            + "unsupported.dbms.index.lucene.writer_max_buffered_docs=100000\n"
            + "unsupported.dbms.index.population_batch_max_byte_size=10.00MiB\n"
            + "unsupported.dbms.index.population_print_debug=false\n"
            + "unsupported.dbms.index.population_queue_threshold=20000\n"
            + "unsupported.dbms.index.populator_block_size=1.00MiB\n"
            + "unsupported.dbms.index.populator_merge_factor=8\n"
            + "unsupported.dbms.index.sampling.async_recovery=true\n"
            + "unsupported.dbms.index.sampling.async_recovery_wait=true\n"
            + "unsupported.dbms.index.sampling.log_recovered_samples=false\n"
            + "unsupported.dbms.index.skip_default_indexes_on_creation=false\n"
            + "unsupported.dbms.index.spatial.curve.bottom_threshold=0.0\n"
            + "unsupported.dbms.index.spatial.curve.extra_levels=1\n"
            + "unsupported.dbms.index.spatial.curve.top_threshold=0.0\n"
            + "unsupported.dbms.index_population.parallelism=2\n"
            + "unsupported.dbms.index_population.workers=3\n"
            + "unsupported.dbms.index_sampling.parallelism=4\n"
            + "unsupported.dbms.initial_transaction_heap_grab_size=2.00MiB\n"
            + "unsupported.dbms.io.controller.consider.external.enabled=false\n"
            + "unsupported.dbms.kernel_id=No Value\n" + "unsupported.dbms.lock_manager=forseti\n"
            + "unsupported.dbms.lock_manager.verbose_deadlocks=false\n"
            + "unsupported.dbms.locks.forseti_deadlock_resolution_strategy=ABORT_YOUNG\n"
            + "unsupported.dbms.logs.query.heap_dump_enabled=false\n"
            + "unsupported.dbms.loopback_delete=false\n"
            + "unsupported.dbms.loopback_enabled=false\n"
            + "unsupported.dbms.loopback_file=No Value\n"
            + "unsupported.dbms.lucene.ephemeral=false\n"
            + "unsupported.dbms.max_http_request_header_size=20480\n"
            + "unsupported.dbms.max_http_response_header_size=20480\n"
            + "unsupported.dbms.memory.counts_store_max_cached_entries=1000000\n"
            + "unsupported.dbms.memory.managed_network_buffers=false\n"
            + "unsupported.dbms.memory.neo_byte_buffer_pool.buckets_override=\n"
            + "unsupported.dbms.memory.neo_byte_buffer_pool.collection_interval_override=No Value\n"
            + "unsupported.dbms.query.snapshot=false\n"
            + "unsupported.dbms.query.snapshot.retries=5\n"
            + "unsupported.dbms.recovery.enable_parallelism=false\n"
            + "unsupported.dbms.recovery.ignore_store_id_validation=false\n"
            + "unsupported.dbms.report_configuration=false\n"
            + "unsupported.dbms.security.auth_store.location=",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(),
        "\n" + "unsupported.dbms.security.ldap.authorization.connection_pooling=true\n"
            + "unsupported.dbms.ssl.system.ignore_dot_files=false\n"
            + "unsupported.dbms.storage.consistency_check_on_apply=false\n" +
            "unsupported.dbms.storage_engine=record\n"
            + "unsupported.dbms.strictly_prioritize_id_freelist=false\n"
            + "unsupported.dbms.tokenscan.log.enabled=false\n"
            + "unsupported.dbms.tokenscan.log.prune_threshold=2d\n"
            + "unsupported.dbms.tokenscan.log.rotation_threshold=200.00MiB\n"
            + "unsupported.dbms.tracer=No Value\n"
            + "unsupported.dbms.transaction_start_timeout=1s\n"
            + "unsupported.dbms.tx_log.fail_on_corrupted_log_files=true\n"
            + "unsupported.dbms.upgrade_restriction_enabled=false\n"
            + "unsupported.dbms.uris.browser=/browser/\n"
            + "unsupported.dbms.uris.db=/db\n" + "unsupported.dbms.uris.dbms=/dbms\n"
            + "unsupported.dbms.uris.management=/db/manage\n"
            + "unsupported.dbms.uris.rest=/db/data\n"
            + "unsupported.dbms.wadl_generation_enabled=false\n" +
            "unsupported.tools.batch_inserter.batch_size=10000\n"
            + "unsupported.vm_pause_monitor.measurement_duration=100ms\n"
            + "unsupported.vm_pause_monitor.stall_alert_threshold=100ms\n");
    assertEquals(expectedToStringResult, actualLodnocoiConfigResult.toString());
    assertEquals(529, actualLodnocoiConfigResult.getValues().size());
    Setting<Object> getResult = declaredSettings.get("unsupported.dbms.index.archive_failed");
    assertTrue(getResult.internal());
    assertEquals(
        "Create an archive of an index before re-creating it if failing to load on startup.",
        getResult.description());
    assertTrue(declaredSettings.get("unsupported.dbms.strictly_prioritize_id_freelist").internal());
    assertEquals("The hostname or IP address of the Graphite server",
        declaredSettings.get("metrics.graphite.server").description());
    Setting<Object> getResult1 = declaredSettings.get(
        "unsupported.dbms.max_http_request_header_size");
    assertEquals("Maximum request header size", getResult1.description());
    assertTrue(getResult1.internal());
  }
}

