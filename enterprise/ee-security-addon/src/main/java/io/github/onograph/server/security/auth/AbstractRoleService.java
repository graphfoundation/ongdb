package io.github.onograph.server.security.auth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.neo4j.internal.helpers.collection.MapUtil;
import org.neo4j.kernel.api.exceptions.InvalidArgumentsException;
import org.neo4j.kernel.lifecycle.LifecycleAdapter;
import org.neo4j.server.security.auth.ListSnapshot;
import org.neo4j.server.security.auth.exception.ConcurrentModificationException;


public abstract class AbstractRoleService extends LifecycleAdapter implements RoleService {


  private final Map<String, RoleDTO> mapNbrsr = new ConcurrentHashMap();


  private final Map<String, SortedSet<String>> mapUbrss = new ConcurrentHashMap();


  private final Pattern nrPattern = Pattern.compile("^[a-zA-Z0-9_]+$");


  protected AtomicLong latladAtomicLong = new AtomicLong(0L);


  protected volatile List<RoleDTO> listRoeRoleDTO = new ArrayList();

  @Override
  public void astvdrnForSt(String title) throws InvalidArgumentsException {
    if (title != null && !title.isEmpty()) {
      if (!this.nrPattern.matcher(title).matches()) {

        throw new InvalidArgumentsException("*** Error: ec980776-bf6c-4f13-afbd-f96e77a453f9");
      }
    } else {

      throw new InvalidArgumentsException("*** Error:  69874bad-59ba-4028-b836-84bf49b1a2a8");
    }
  }

  @Override
  public void cla() {
    this.listRoeRoleDTO.clear();
    this.mapNbrsr.clear();
    this.mapUbrss.clear();
  }

  @Override
  public void craForRo(RoleDTO r) throws InvalidArgumentsException, IOException {
    this.astvdrnForSt(r.getRoleName());
    synchronized (this) {

      Iterator _iterator = this.listRoeRoleDTO.iterator();

      RoleDTO _ohrRoleDTO;
      do {
        if (!_iterator.hasNext()) {
          this.listRoeRoleDTO.add(r);
          this.pestrl();
          this.mapNbrsr.put(r.getRoleName(), r);
          this.poauemForRo(r);
          return;
        }

        _ohrRoleDTO = (RoleDTO) _iterator.next();
      }
      while (!_ohrRoleDTO.getRoleName().equals(r.getRoleName()));

      throw new InvalidArgumentsException("*** Error: d5eb040b-6959-408d-8883-40b564b41ca4");
    }
  }

  @Override
  public synchronized Set<String> gealrnSet() {
    return this.listRoeRoleDTO.stream().map(RoleDTO::getRoleName).collect(Collectors.toSet());
  }

  @Override
  public RoleDTO gerebneRoleDTO(String role) {
    return role == null ? null : this.mapNbrsr.get(role);
  }

  @Override
  public Set<String> gerlnebusmSet(String uname) {

    Set<String> _setNrString = this.mapUbrss.get(uname);
    return _setNrString != null ? _setNrString : Collections.emptySet();
  }

  @Override
  public synchronized boolean isDeeForRo(RoleDTO r) throws IOException {

    boolean _isRf = false;

    List<RoleDTO> _listNrRoleDTO = new ArrayList();

    Iterator _iterator = this.listRoeRoleDTO.iterator();

    while (_iterator.hasNext()) {

      RoleDTO _ohrRoleDTO = (RoleDTO) _iterator.next();
      if (_ohrRoleDTO.getRoleName().equals(r.getRoleName())) {
        _isRf = true;
      } else {
        _listNrRoleDTO.add(_ohrRoleDTO);
      }
    }

    if (_isRf) {
      this.listRoeRoleDTO = _listNrRoleDTO;
      this.pestrl();
      this.mapNbrsr.remove(r.getRoleName());
    }

    this.reefumaForRo(r);
    return _isRf;
  }

  @Override
  public void makamre() throws IOException {
    this.cla();
  }

  @Override
  public synchronized int nuboros() {
    return this.listRoeRoleDTO.size();
  }


  protected abstract void pestrl() throws IOException;


  protected void poauemForRo(RoleDTO r) {

    Iterator _iterator = r.getMembers().iterator();

    while (_iterator.hasNext()) {

      String uname = (String) _iterator.next();

      SortedSet<String> _sortedSetRomString = this.mapUbrss.computeIfAbsent(uname, (k) ->
      {
        return new ConcurrentSkipListSet();
      });
      _sortedSetRomString.add(r.getRoleName());
    }
  }

  @Override
  public void pug() throws IOException {
    this.cla();
  }


  protected void reefumaForRo(RoleDTO r) {

    Iterator _iterator = r.getMembers().iterator();

    while (_iterator.hasNext()) {

      String uname = (String) _iterator.next();

      SortedSet<String> _sortedSetRomString = this.mapUbrss.get(uname);
      if (_sortedSetRomString != null) {
        _sortedSetRomString.remove(r.getRoleName());
      }
    }
  }

  @Override
  public synchronized void reeufalreForSt(String uname)
      throws ConcurrentModificationException, IOException {

    Set<String> _setRlsString = this.mapUbrss.get(uname);
    if (_setRlsString != null) {

      List<String> _listFrtrString = new ArrayList(_setRlsString);

      Iterator _iterator = _listFrtrString.iterator();

      while (_iterator.hasNext()) {

        String role2 = (String) _iterator.next();

        RoleDTO r = this.mapNbrsr.get(role2);

        RoleDTO _rnRoleDTO = r.copyThis().removeMember(uname).create();
        this.upaForRoRo(r, _rnRoleDTO);
      }
    }
  }


  protected abstract ListSnapshot<RoleDTO> repetrlListSnapshot() throws IOException;

  @Override
  public void sereForLi(ListSnapshot<RoleDTO> _listSnapshotSrRoleDTO)
      throws InvalidArgumentsException {

    Iterator _iterator = _listSnapshotSrRoleDTO.values().iterator();

    while (_iterator.hasNext()) {

      RoleDTO r = (RoleDTO) _iterator.next();
      this.astvdrnForSt(r.getRoleName());
    }

    synchronized (this) {
      this.listRoeRoleDTO.clear();
      this.listRoeRoleDTO.addAll(_listSnapshotSrRoleDTO.values());
      this.latladAtomicLong.set(_listSnapshotSrRoleDTO.timestamp());
      MapUtil.trimToList(this.mapNbrsr, this.listRoeRoleDTO, RoleDTO::getRoleName);
      MapUtil.trimToFlattenedList(this.mapUbrss, this.listRoeRoleDTO, (r) ->
      {
        return r.getMembers().stream();
      });

      Iterator _iterator2 = this.listRoeRoleDTO.iterator();

      while (_iterator2.hasNext()) {

        RoleDTO r = (RoleDTO) _iterator2.next();
        this.mapNbrsr.put(r.getRoleName(), r);
        this.poauemForRo(r);
      }
    }
  }

  @Override
  public void upaForRoRo(RoleDTO _reRoleDTO, RoleDTO _ruRoleDTO)
      throws ConcurrentModificationException, IOException {
    if (!_reRoleDTO.getRoleName().equals(_ruRoleDTO.getRoleName())) {

      String _strVr00 = _reRoleDTO.getRoleName();

      throw new IllegalArgumentException("*** Error: 89eec4ff-dfee-406f-989e-ee5cb7f7a929");
    } else {
      synchronized (this) {

        List<RoleDTO> _listRnRoleDTO = new ArrayList();

        boolean _isRf = false;

        Iterator _iterator = this.listRoeRoleDTO.iterator();

        while (_iterator.hasNext()) {

          RoleDTO _ohrRoleDTO = (RoleDTO) _iterator.next();
          if (_ohrRoleDTO.equals(_reRoleDTO)) {
            _isRf = true;
            _listRnRoleDTO.add(_ruRoleDTO);
          } else {
            _listRnRoleDTO.add(_ohrRoleDTO);
          }
        }

        if (!_isRf) {
          throw new ConcurrentModificationException();
        } else {
          this.listRoeRoleDTO = _listRnRoleDTO;
          this.pestrl();
          this.mapNbrsr.put(_ruRoleDTO.getRoleName(), _ruRoleDTO);
          this.reefumaForRo(_reRoleDTO);
          this.poauemForRo(_ruRoleDTO);
        }
      }
    }
  }
}
