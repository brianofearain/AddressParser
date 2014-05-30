package com.bttw.address.src;

import java.util.Map;

public class NamedGroupPattern
{
  private final String _regex;
  private final Map<Integer, String> _namedGroupMap;

  public NamedGroupPattern(String regex, Map<Integer, String> namedGroupMap)
  {
    this._regex = regex;
    this._namedGroupMap = namedGroupMap;
  }
  public String getRegex() {
    return this._regex;
  }
  public Map<Integer, String> getNamedGroupMap() {
    return this._namedGroupMap;
  }
}