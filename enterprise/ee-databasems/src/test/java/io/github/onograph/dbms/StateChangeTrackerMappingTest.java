package io.github.onograph.dbms;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class StateChangeTrackerMappingTest {

  @Test
  void testBulrStateChangeTrackerMappingFlowFactory() {

    StateChangeTrackerMapping.bulrStateChangeTrackerMappingFlowFactory();
  }

  @Test
  void testBulrStateChangeTrackerMappingFlowFactory2() {

    StateChangeTrackerMapping.bulrStateChangeTrackerMappingFlowFactory();
  }

  @Test
  void testFlowFactoryBulStateChangeTrackerMapping() {

    StateChangeTrackerMapping.bulrStateChangeTrackerMappingFlowFactory()
        .bulStateChangeTrackerMapping();
  }

  @Test
  void testFlowFactoryBulStateChangeTrackerMapping2() {
    StateChangeTrackerMapping.FlowFactory bulrStateChangeTrackerMappingFlowFactoryResult = StateChangeTrackerMapping
        .bulrStateChangeTrackerMappingFlowFactory();
    bulrStateChangeTrackerMappingFlowFactoryResult.froStateChangeTrackerMappingReqsTargetTrans(null,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
    assertThrows(IllegalStateException.class,
        () -> bulrStateChangeTrackerMappingFlowFactoryResult.bulStateChangeTrackerMapping());
  }

  @Test
  void testFlowFactoryDonoiStateChangeTrackerMappingCreateOrNext() {

    StateChangeTrackerMapping.FlowFactory bulrStateChangeTrackerMappingFlowFactoryResult = StateChangeTrackerMapping
        .bulrStateChangeTrackerMappingFlowFactory();
    bulrStateChangeTrackerMappingFlowFactoryResult.froStateChangeTrackerMappingReqsTargetTrans(
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING,
        OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
    bulrStateChangeTrackerMappingFlowFactoryResult.donoiStateChangeTrackerMappingCreateOrNext();
  }

  @Test
  void testFlowFactoryFroStateChangeTrackerMappingReqsTargetTrans() {
    StateChangeTrackerMapping.ReqsTargetTrans actualFroStateChangeTrackerMappingReqsTargetTransResult = StateChangeTrackerMapping
        .bulrStateChangeTrackerMappingFlowFactory()
        .froStateChangeTrackerMappingReqsTargetTrans(
            OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING,
            OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING);
    assertSame(actualFroStateChangeTrackerMappingReqsTargetTransResult,
        actualFroStateChangeTrackerMappingReqsTargetTransResult
            .toStateChangeTrackerMappingRequiresTrans(
                OperatorStateEnterpriseTypeImpl.SETI_NOT_RUNNING));
  }
}

